package Player;

import behaviours.IWeapon;

public class Club extends Weapon {

    private int damage;

    public Club(String name) {
        super(name);
        this.damage = 3;
    }

    public int attack() {
        return damage;
    }
}
