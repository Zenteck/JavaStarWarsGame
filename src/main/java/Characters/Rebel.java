package Characters;

import Behaviours.IAttack;
import Behaviours.ILoseHealth;
import Gear.Blaster;
import Gear.Weapon;

public class Rebel extends PlayerCharacter implements IAttack{

    public Rebel(String name) {
        super(name);
        this.weapon = new Blaster();
//        this.equipment = new ThermalDetonator;
    }


    public void attack(int damageValue, ILoseHealth target) {

    }
}
