package projekat_4;

class Enemy extends GameObject implements Attacker {

	private String type;
	private int damage;
	private int health;

	public Enemy(int x, int y, Collidable collider, String type, int damage, int health) {
		super(x, y, collider);
		this.type = type;
		this.damage = damage;
		this.health = health;
	}
	
    @Override
    public String toString() {
        String colliderInfo = "";
        if (getCollider() instanceof RectangleCollider) {
            RectangleCollider rc = (RectangleCollider) getCollider();
            colliderInfo = rc.getWidth() + "x" + rc.getHeight();
        } else {
             colliderInfo = "Circle";
        }
        return String.format("Enemy[%s] @ (%d,%d) %s DMG=%d HP=%d", 
            type, getX(), getY(), colliderInfo, getEffectiveDamage(), health);
    }
    
	// START GETTERS & SETTERS
    protected int getRawDamage() { 
    	return damage; 
    }
    
    protected int getRawHealth() { 
    	return health; 
    }
	
    @Override
    public int getEffectiveDamage() {
        return damage;
    }

    @Override
    public String getDisplayName() {
        return type;
    }
	
    public void setDamage(int damage) {
        if (damage < 0 || damage > 100) throw new IllegalArgumentException("Damage mora biti izmedju 0 i 100.");
        this.damage = damage;
    }

    public void setHealth(int health) {
        if (health < 0 || health > 100) throw new IllegalArgumentException("Health mora biti izmedju 0 i 100.");
        this.health = health;
    }
    public String getType() { 
    	return type;
    }
	
    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Tip neprijatelja ne smije biti prazan.");
        }
        this.type = type.trim();
    }
    // END GETTERS & SETTERS
}
