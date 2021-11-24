package Player;

import behaviours.IWeapon;

public abstract class Enemy implements IWeapon {

    IWeapon weapon;
    private String name;

    public Enemy(String name, IWeapon weapon ){
        this.name = name;
        this.weapon = weapon;
    }

    public abstract void takeDamage(Warrior warrior);


}
