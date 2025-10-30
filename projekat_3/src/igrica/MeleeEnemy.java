package igrica;

class MeleeEnemy extends Enemy {
	
	private String tipOruzja;
	
	// Konstruktor
	public MeleeEnemy(int x, int y, int width, int height, int damage, int health, String tip, String tipOruzja) {
		super(x, y, width, height, damage, health, tip);
		setTipOruzja(tipOruzja);
	}
	
	// Stampanje
	@Override
	public String toString() {
		return "MeleeEnemy[" + super.getTip() + "] @ (" + super.getX() + ", " + super.getY() + ") " + super.getWidth() + "x" + super.getHeight() + " DMG=" + getDamage() + "ORUZJE=" + getTipOruzja() + " HP=" + getHealth();
	}
	
	// Getteri i setteri
	public String getTipOruzja() {
		return tipOruzja;
	}

	public void setTipOruzja(String tipOruzja) {
		this.tipOruzja = tipOruzja;
	}

}
