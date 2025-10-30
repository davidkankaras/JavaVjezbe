package igrica;

class BossEnemy extends Enemy {
	private String klasaEnemy = "boss";
	
	// Konstruktor
	public BossEnemy(int x, int y, int width, int height, int damage, int health, String tip) {
		super(x * 2, y, width, height, damage, health, tip);
	}
	
	// BOSS TO STRING
	@Override
	public String toString() {
		return "BO$$Enemy[" + super.getTip() + "] @ (" + super.getX() + ", " + super.getY() + ") " + super.getWidth() + "x" + super.getHeight() + " DMG=" + getDamage() + " HP=" + getHealth();
	}

	// Getteri i setteri
	public String getKlasaEnemy() {
		return klasaEnemy;
	}

	public void setKlasaEnemy(String klasaEnemy) {
		this.klasaEnemy = klasaEnemy;
	}
	
}
