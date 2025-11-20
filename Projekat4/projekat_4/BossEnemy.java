package projekat_4;

class BossEnemy extends Enemy {
    public BossEnemy(int x, int y, Collidable collider, String type, int damage, int health) {
        super(x, y, collider, type, damage, health);
    }
    
    // Taj 1 getter zbog double dmg
    @Override
    public int getEffectiveDamage() {
        return getRawDamage() * 2;
    }

    @Override
    public String toString() {
        String base = super.toString();
        return base.replace("Enemy[", "BossEnemy[")
                   .replace("DMG=" + getEffectiveDamage(), "DMG=" + getRawDamage() + "x2");
    }
}
