package Characters;

import Behaviours.IAttack;
import Behaviours.IForce;
import Behaviours.ILoseHealth;
import Gear.Lightsaber;
import Gear.Weapon;

public class Jedi extends PlayerCharacter implements IAttack, IForce {

    private boolean lightDark;
    private int forcePower;

    public Jedi(String name, boolean lightDark, int forcePower) {
        super(name);
        this.lightDark = lightDark;
        this.forcePower = forcePower;
        this.makeLightsaber();
    }

    public int getForcePower() {
        return forcePower;
    }

    public boolean isLightDark() {
        return lightDark;
    }

    public void makeLightsaber() {
        String colour = "red";
        if(this.lightDark){
            colour = "blue";
        }
        Weapon lightsaber = new Lightsaber(colour);
        this.weapon = lightsaber;
    }

    public int getWeaponDamage(){
        return weapon.getDamageValue();
    }

    public void attack(int damage, ILoseHealth target){
        target.loseHealth(damage);

    }

}
