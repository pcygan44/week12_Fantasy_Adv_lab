package Player;

import behaviours.IWeapon;

public class Axe extends Weapon {

    private int damage;

    public Axe(String name, int damage) {
        super(name);
        this.damage = 9;
    }

    public int attack() {
        return damage;
    }
}
