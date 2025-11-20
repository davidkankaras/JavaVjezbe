package projekat_4;

public class Main {

	public static void main(String[] args) {
        try {
            RectangleCollider playerCollider = new RectangleCollider(10, 10, 32, 32);
            Player p = new Player(10, 10, playerCollider, " peTar  petrovic ", 100);
            System.out.println("Created: " + p);

            Game game = new Game(p);

            CircleCollider cCol = new CircleCollider(15, 15, 10);
            MeleeEnemy e1 = new MeleeEnemy(15, 15, cCol, "Slime", 10, 40);
            game.addEnemy(e1);

            // "Goblin King; 12,5; 32x32; 25; boss"
            Enemy e2 = Game.parseEnemy("Goblin King;12,5;32x32;25;boss");
            game.addEnemy(e2);

            System.out.println("%nNeprijatelji koji imaju 'gob' u nazivu: " + game.findByType("gob"));
            System.out.println("%nRjesavanje sudara: ");
            game.resolveCollisions(); 
            
            System.out.println("%nPosle sudara: " + p);
            
            game.printLog();
            
        } catch (Exception e) {
        	e.printStackTrace();
        }
	} 
}
