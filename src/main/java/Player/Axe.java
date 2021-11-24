package Player;

import behaviours.IWeapon;

public class Axe extends Weapon {

    private int damage;

    public Axe(String name) {
        super(name);
        this.damage = 9;
    }

    public int attack() {
        return damage;
    }
}
