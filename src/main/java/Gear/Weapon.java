package Gear;

import Behaviours.IAttack;

public abstract class Weapon{

    private int damageValue;

    public Weapon(){
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

}
