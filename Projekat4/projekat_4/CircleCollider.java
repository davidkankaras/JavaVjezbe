package projekat_4;

class CircleCollider implements Collidable {
	private int x, y, poluprecnik;
	
	public CircleCollider(int x, int y, int poluprecnik) {
		if (poluprecnik <= 0) {
			throw new IllegalArgumentException("Poluprecnik mora biti veci od 0.");
		}
		
		this.x = x;
		this.y = y;
		this.poluprecnik = poluprecnik;
	}
	
    @Override
    public boolean intersects(Collidable other) {
        if (other instanceof CircleCollider) {
            CircleCollider c = (CircleCollider) other;
            int dx = this.x - c.x;
            int dy = this.y - c.y;
            int distanceSquared = dx * dx + dy * dy;
            int radiusSum = this.poluprecnik + c.poluprecnik;
            return distanceSquared <= radiusSum * radiusSum;
            
        } else if (other instanceof RectangleCollider) {
            RectangleCollider r = (RectangleCollider) other;
            
            int closestX = ogranici(this.x, r.getX(), r.getX() + r.getWidth());
            int closestY = ogranici(this.y, r.getY(), r.getY() + r.getHeight());
            
            int dx = this.x - closestX;
            int dy = this.y - closestY;
            
            return (dx * dx + dy * dy) <= (this.poluprecnik * this.poluprecnik);
        }
        return false;
    }
    
    public int getPoluprecnik() {
    	return this.poluprecnik;
    }
    
    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
      
    private int ogranici(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }
	
}
