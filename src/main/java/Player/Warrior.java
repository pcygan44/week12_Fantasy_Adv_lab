package Player;

import behaviours.IWeapon;

public abstract class Warrior extends Player implements IWeapon {

    public Warrior(String name) {
        super(name);
    }


}
