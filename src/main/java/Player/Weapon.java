package Player;

import behaviours.IWeapon;

public abstract class Weapon implements IWeapon {
    private String name;

    public Weapon(String name) {
        this.name = name;
    }
}
