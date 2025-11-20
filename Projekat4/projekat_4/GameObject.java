package projekat_4;

abstract class GameObject {
	private int x;
	private int y;
	private Collidable collider;
	
    public GameObject(int x, int y, Collidable collider) {
        this.x = x;
        this.y = y;
        this.collider = collider;
    }
    
    private void updateCollider() {
        if (collider instanceof RectangleCollider) {
            ((RectangleCollider) collider).setPos(x, y);
        } else if (collider instanceof CircleCollider) {
            ((CircleCollider) collider).setPos(x, y);
        }
    }

    public boolean intersects(GameObject other) {
        return this.collider.intersects(other.collider);
    }
    
    public abstract String getDisplayName();

    @Override
    public String toString() {
        return getDisplayName() + " at (" + x + ", " + y + ")";
    }
    
    // START Getteri i setteri
    public Collidable getCollider() { return collider; }
    
    public int getX() { return x; }
    
    public void setX(int x) { 
        this.x = x; 
        updateCollider();
    }

    public int getY() { return y; }
    
    public void setY(int y) { 
        this.y = y; 
        updateCollider();
    }
    // END Ghetto i setteri

}
