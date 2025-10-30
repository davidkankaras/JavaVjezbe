package igrica;
import java.util.ArrayList;

/*
 * Članovi grupe:
 * David Kankaraš 24/094
 * Antonije Dragićević 24/107
 * Github link: https://github.com/ad-005/JavaVjezbe/tree/main/projekat_3
 * 
 */

public class Game {
	
	// "Rjesavanje" sudara (oduzimanje health-a za zbir damage svih enemy objekata)
	public static void resolveCollisions(ArrayList<Enemy> enemies, Player p) {
		for (Enemy enemy : enemies) {
			if (checkCollision(p, enemy)) {
				decreaseHealth(p, enemy);
			}
		}
	}
	
	// Dodavanje u listu u slucaju da se sudaraju neprijatelj i igrac
	public static ArrayList<Enemy> collidingWithPlayer(ArrayList<Enemy> enemies, Player p) {
		ArrayList<Enemy> colliding = new ArrayList<Enemy>();
		
		for (Enemy enemy : enemies) {
			if (checkCollision(p, enemy)) {
				colliding.add(enemy);
			}
		}
		
		return colliding;
	}
	
	// Pronalazenje tipa neprijatelja na osnovu substringa (case insensitive)
	public static ArrayList<Enemy> findByType(ArrayList<Enemy> enemies, String query) {
		ArrayList<Enemy> odgTip = new ArrayList<Enemy>();
		
		for (Enemy enemy : enemies) {
			if (enemy.getTip().toLowerCase().contains(query.toLowerCase())) {
				odgTip.add(enemy);
			}
		}
		
		return odgTip;
	}
	
	// Dodavanje neprijatelja
	public static void addEnemy(Enemy e, ArrayList<Enemy> enemies, ArrayList<String> log) {
		String formattedLog = "DODATO: Enemy[" + e.getTip() + "] @ (" + e.getX() + ", " + e.getY() + ") " + e.getWidth() + "x" + e.getHeight() + " DMG=" + e.getDamage();
		
		enemies.add(e);
		log.add(formattedLog);
	}
	
	// Dodavanje neprijatelja (za string, method overloading)
	public static void addEnemy(String enemy, ArrayList<Enemy> enemies, ArrayList<String> log) {
		String[] podaci = enemy.split(";");
		String tip = podaci[0];
		
		// Parsing koordinata
		String[] koordinate = podaci[1].split(",");
		int x = Integer.parseInt(koordinate[0]);
		int y = Integer.parseInt(koordinate[1]);
		
		// Parsing dimenzija
		String[] dimenzije = podaci[2].split("x");
		int width = Integer.parseInt(dimenzije[0]);
		int height = Integer.parseInt(dimenzije[1]);
		
		// Parsing health-a
		int health = Integer.parseInt(podaci[3]);
		
		// Dmg
		int damage = Integer.parseInt(podaci[3]);
		
		// Klasa neprijatelja (boss ili melee)
		String klasaEnemy = podaci[4];
		
		Enemy e = null;
		
		if (klasaEnemy.equals("boss") ) {
			e = new BossEnemy(x, y, width, height, damage, health, tip);
		} else if (klasaEnemy.equals("melee")) {
			if (podaci.length > 5 && !podaci[5].isEmpty()){
				e = new MeleeEnemy(x, y, width, height, damage, health, tip, podaci[5]);
			} else {
				e = new MeleeEnemy(x, y, width, height, damage, health, tip, "britka sablja");
			}
		}
		
	    if (e != null) {
	        String formattedLog = "DODATO: Enemy[" + e.getTip() + "] @ (" 
	            + e.getX() + ", " + e.getY() + ") " 
	            + e.getWidth() + "x" + e.getHeight() 
	            + " DMG=" + e.getDamage();
	        
	        enemies.add(e);
	        log.add(formattedLog);
	    }
	}

	// Oduzimanje health-a
	public static String decreaseHealth(Player p, Enemy e) {
		double playerHealthTemp = p.getHealth();
		
		if (p.getHealth() < e.getDamage())
			p.setHealth(0);
		
		else
			p.setHealth(p.getHealth() - e.getDamage());
		
		if (p.getHealth() == 0) 
			System.out.print("Igrac poginuo.");
		else
			System.out.printf("Igrac povrijedjen za %dHP. Preostalo HP: %d", e.getDamage(), p.getHealth());
		
		return "HIT: Player by Goblin for " + e.getDamage() + " -> HP " + playerHealthTemp + " -> " + p.getHealth();
	}
	
	// Provjera sudara
	public static boolean checkCollision(Player p, Enemy e) {
		
		int xP = p.getX(), yP = p.getY(), xE = e.getX(), yE = e.getY(),
				pWidth = p.getWidth(), pHeight = p.getHeight(), eWidth = e.getWidth(), eHeight = e.getHeight();
		
		return (xP < xE + eWidth && xP + pWidth > xE && yP < yE + eHeight && yP + pHeight > yE);
		
	}
	
	public static void main(String[] args) {
	    ArrayList<String> eventLog = new ArrayList<String>();
	    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	    String goblin = "Goblin;12,5;16x16;20;100;boss";
	    Enemy svraka = new Enemy(30, 30, 3, 2, 10, 100, "Svraka");
	    
	    addEnemy(goblin, enemies, eventLog);
	    addEnemy(svraka, enemies, eventLog);
	    
	    Player player1 = new Player(10, 5, 32, 32, 85, "  Marko   Markovic  ");
	    
	    for (Enemy e : enemies) {
	        System.out.println(e);
	    }
	    
	    ArrayList<Enemy> foundNeprijatelji = findByType(enemies, "gob");
	    for (Enemy e : foundNeprijatelji) {
	        System.out.println(e);
	    }
	    
	    System.out.println(player1);
	    ArrayList<Enemy> colliding = collidingWithPlayer(enemies, player1);
	    System.out.println(colliding.size());
	    
	    resolveCollisions(enemies, player1);
	    
	    System.out.println(player1);
	    
	    for (String event : eventLog) {
	        System.out.println(event);
	    }
		
	}

}
