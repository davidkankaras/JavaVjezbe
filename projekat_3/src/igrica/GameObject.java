package igrica;

public class GameObject {
	private int x, y, width, height;

	// toString za ispis
	@Override
	public String toString() {
		return "GameObject @ (" + x + "," + y + ")" + " " + width + "x" + height;
	}

	
	// Metoda za provjeru sudara (intersects u textu zadatka)
	public boolean checkCollision(GameObject other) {
		
		int xP = getX(), yP = getY(), xE = other.getX(), yE = other.getY(),
				pWidth = getWidth(), pHeight = getHeight(), eWidth = other.getWidth(), eHeight = other.getHeight();
		
		return (xP < xE + eWidth && xP + pWidth > xE && yP < yE + eHeight && yP + pHeight > yE);
		
	}
	
	// Konstruktor
	public GameObject(int x, int y, int width, int height) {
		super();
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	// START GETTERS & SETTERS
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
		if (width <= 0) {
			System.err.println("Širina mora biti veća od 0.");
		} else {
			this.width = width;
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height <= 0) {
			System.err.println("Visina mora biti veća od 0.");
		} else {
			this.height = height;
		}
	}
	// END GETTERS & SETTERS
	
	
}
