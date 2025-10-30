package igrica;

class Player extends GameObject {
	
	private int health;
	private String ime;

	// Konstruktor
	public Player(int x, int y, int width, int height, int health, String ime) {
		super(x, y, width, height);
		setHealth(health);
		setIme(ime);
	}

	
	// TOSTRING OVERRIDE ZA ISPIS IGRACA
	@Override
	public String toString() {
		return "Player[" + this.ime + "] @ (" + super.getX() + ", " + super.getY() + ") " + super.getWidth() + "x" + super.getHeight() + " HP=" + getHealth();
	}

	// START GETTERS & SETTERS
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		if (ime.trim().isEmpty()) {
			System.err.printf("%nIme ne smije biti prazno.");
		} else {
			String formattedImeTemp1 = ime.trim().replaceAll("\\s+", " ");
			String[] formattedImeTemp2 = formattedImeTemp1.split(" ");
			StringBuilder formattedIme = new StringBuilder();
			
			for (String rijec : formattedImeTemp2) {
				if (!rijec.isEmpty()) {
					formattedIme.append(Character.toUpperCase(rijec.charAt(0))).append(rijec.substring(1).toLowerCase()).append(" ");
				}
			}
			
			this.ime = formattedIme.toString();
			
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
	// END GETTERS & SETTERS
	

}
