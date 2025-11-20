package projekat_4;
import java.util.ArrayList;
import java.util.List;

class Game {
    private Player player;
    private List<Enemy> enemies;
    private List<String> eventLog;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }

    public void addEnemy(Enemy e) {
        if (e == null) throw new IllegalArgumentException("Enemy ne moze biti nista.");
        enemies.add(e);
        eventLog.add("Enemy added: " + e.getType());
    }

    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        if (p == null || e == null) throw new IllegalArgumentException("Player/Enemy ne moze biti nista.");
        
        int dmg = e.getEffectiveDamage();
        int oldHp = p.getHealth();
        int newHp = Math.max(0, oldHp - dmg);
        
        p.setHealth(newHp);
        
        eventLog.add(String.format("HIT: Player od %s za %d -> HP %d -> %d", 
            e.getType(), dmg, oldHp, newHp));
    }
    
    public List<Enemy> findByType(String query) {
        List<Enemy> results = new ArrayList<>();
        String lowerQuery = query.toLowerCase();
        for (Enemy e : enemies) {
            if (e.getType().toLowerCase().contains(lowerQuery)) {
                results.add(e);
            }
        }
        return results;
    }

    public List<Enemy> collidingWithPlayer() {
        List<Enemy> collisions = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                collisions.add(e);
            }
        }
        return collisions;
    }
    
    public void resolveCollisions() {
        List<Enemy> colliding = collidingWithPlayer();
        for (Enemy e : colliding) {
            decreaseHealth(player, e);
        }
    }
    
    public static Enemy parseEnemy(String line) {
        // Format: "Goblin;12,5;16x16;20;boss" or "Goblin;12,5;16x16;20;melee"
        try {
            String[] parts = line.split(";");
            if (parts.length < 5) throw new IllegalArgumentException("Los format string-a.");
            
            String type = parts[0];
            
            String[] coords = parts[1].split(",");
            int x = Integer.parseInt(coords[0].trim());
            int y = Integer.parseInt(coords[1].trim());
            
            String[] dims = parts[2].split("x"); 
            int w = Integer.parseInt(dims[0].trim());
            int h = Integer.parseInt(dims[1].trim());
            RectangleCollider collider = new RectangleCollider(x, y, w, h);
            
            int dmg = Integer.parseInt(parts[3].trim());
            String category = parts[4].trim().toLowerCase();
            
            if (category.equals("boss")) {
                return new BossEnemy(x, y, collider, type, dmg, 100);
            } else {
                return new MeleeEnemy(x, y, collider, type, dmg, 50);
            }
            
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("GRESKA: " + e.getMessage());
        }
    }
    
    public void printLog() {
        System.out.println("\n--- LOG DOGADJAJA ---");
        for (String log : eventLog) {
            System.out.println(log);
        }
    }
}
