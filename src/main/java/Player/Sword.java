package Player;

import behaviours.IWeapon;

public class Sword extends Weapon {

    private int damage;

    public Sword(String name) {
        super(name);
        this.damage = 5;
    }

    public int attack() {
        return damage;
    }
}
