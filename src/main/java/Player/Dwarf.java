package Player;

import behaviours.IWeapon;

public class Dwarf extends Warrior {
    
    private int health;
    
    IWeapon weapon;

    public Dwarf(String name, IWeapon weapon) {
        super(name);
        this.health = 100;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }
    
    public void takeDamage(Enemy enemy) {
        this.health -= enemy.attack();
    }

    public int attack() {
        return weapon.attack();
    }
}
