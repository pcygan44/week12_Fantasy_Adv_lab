package Player;

import behaviours.IWeapon;

public abstract class Player {


    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void takeDamage(Enemy enemy);



}
