package projekat_4;

class Player extends GameObject {
	private String name;
	private int health;
	
    public Player(int x, int y, Collidable collider, String name, int health) {
        super(x, y, collider);
        setName(name);
        setHealth(health);
    }

    @Override
    public String toString() {
        String colliderInfo = "";
        if (getCollider() instanceof RectangleCollider) {
            RectangleCollider rc = (RectangleCollider) getCollider();
            colliderInfo = rc.getWidth() + "x" + rc.getHeight();
        } else if (getCollider() instanceof CircleCollider) {
            CircleCollider cc = (CircleCollider) getCollider();
            colliderInfo = "R=" + cc.getPoluprecnik();
        }
        
        return String.format("Player[%s] @ (%d,%d) %s HP=%d", 
            name, getX(), getY(), colliderInfo, health);
    }
    
    @Override
   public String getDisplayName() {
    	return name;
    }
    
    // START GETTERS & SETTERS
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ime igraca ne smije biti prazno.");
        }
        String[] djelovi = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String dio : djelovi) {
            if (!dio.isEmpty()) {
                sb.append(Character.toUpperCase(dio.charAt(0)))
                  .append(dio.substring(1).toLowerCase())
                  .append(" ");
            }
        }
        this.name = sb.toString().trim();
    }
    
    public int getHealth() { 
    	return health; 
    }
    
    public void setHealth(int health) {
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException("Health mora biti izmedju 0 i 100.");
        }
        this.health = health;
    }
    // END GETTERS & SETTERS
}
