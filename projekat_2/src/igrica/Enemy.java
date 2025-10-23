package igrica;

class Enemy {

	private int x, y, width, height, damage;
	private String tip;

	// TOSTRING OVERRIDE ZA ISPIS NEPRIJATELJA
	@Override
	public String toString() {
		return "Enemy[" + this.tip + "] @ (" + this.x + ", " + this.y + ") " + this.width + "x" + this.height + " DMG=" + getDamage();
	}
	
	// Konstruktor
	public Enemy(int x, int y, int width, int height, int damage, String tip) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		setDamage(damage);
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
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
