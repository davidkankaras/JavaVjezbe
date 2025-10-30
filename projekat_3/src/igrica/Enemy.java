package igrica;

class Enemy extends GameObject {

	private int damage, health;
	private String tip;

	// TOSTRING OVERRIDE ZA ISPIS NEPRIJATELJA
	@Override
	public String toString() {
		return "Enemy[" + this.tip + "] @ (" + super.getX() + ", " + super.getY() + ") " + super.getWidth() + "x" + super.getHeight() + " DMG=" + getDamage() + " HP=" + getHealth();
	}
	
	// Konstruktor
	public Enemy(int x, int y, int width, int height, int damage, int health, String tip) {
		super(x, y, width, height);
		setDamage(damage);
		setHealth(health);
		setTip(tip);
	}

	
	// START GETTERS & SETTERS
	public String getTip() {
		return tip;
	}
	
	public void setTip(String tip) {
		if (tip.trim().isEmpty()) {
			System.err.printf("%nTip neprijatelja ne smije biti prazan.");
		} else {
			this.tip = tip;
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (0 <= health && health <= 100)
			this.health = health;
		else
			System.err.print("%nHealth mora biti izmedju 0 i 100 (uključivo).");
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (0 <= damage && damage <= 100)
			this.damage = damage;
		else
			System.err.print("%nDamage mora biti izmedju 0 i 100 (uključivo).");
	}
	// END GETTERS & SETTERS
	
}
