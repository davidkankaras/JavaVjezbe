package igrica;

class Player {
	
	private int x, y, width, height, health;
	private String ime;

	// Konstruktor
	public Player(String ime, int x, int y, int width, int height, int health) {
	    this.x = x;
	    this.y = y;
	    this.width = width;
	    this.height = height;
	    setHealth(health);
	    setIme(ime);
	}
	
	// TOSTRING OVERRIDE ZA ISPIS IGRACA
	@Override
	public String toString() {
		return "Player[" + this.ime + "] @ (" + this.x + ", " + this.y + ") " + this.width + "x" + this.height + " HP=" + getHealth();
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
					this.ime = formattedIme.toString();
				}
			}
			
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
