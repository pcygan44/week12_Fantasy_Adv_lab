package Player;

import behaviours.IWeapon;

public class Orc extends Enemy{

    private int health;

    public Orc(String name, IWeapon weapon) {
        super(name, weapon);
        this.health = 40;
    }

    public void takeDamage(Warrior warrior) {
        this.health -=  warrior.attack();
    }

    public int attack() {
        return weapon.attack();
    }
}
