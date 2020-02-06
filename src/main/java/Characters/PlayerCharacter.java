package Characters;

import Behaviours.ILoseHealth;
import Gear.Equipment;
import Gear.Weapon;

public abstract class PlayerCharacter implements ILoseHealth {

    private String name;
    private int healthPoints;
    private Equipment equipment;
    public Weapon weapon;

    public PlayerCharacter(String name) {
        this.name = name;
        this.healthPoints = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void loseHealth(int damageValue){
        this.healthPoints -= damageValue;
    }
}
