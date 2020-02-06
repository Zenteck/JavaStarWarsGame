package Gear;

import Behaviours.ILoseHealth;

import java.util.ArrayList;

public class ThermalDetonator {

    private int damage;
    private boolean used;

    public ThermalDetonator(){
        this.used = false;
        this.damage = 50;
    }

    public void detonate(ArrayList<ILoseHealth> targets) {
        if (!used) {
            for (ILoseHealth target : targets) {
                target.loseHealth(this.damage);
                this.used = true;
            }
        }
    }

}
