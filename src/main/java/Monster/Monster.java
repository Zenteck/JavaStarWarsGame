package Monster;

import Behaviours.IAttack;
import Behaviours.ILoseHealth;

public class Monster implements IAttack, ILoseHealth {

    private String species;
    private int healthPoints;
    private int strength;

    public Monster(String species, int healthPoints, int strength) {
        this.species = species;
        this.healthPoints = healthPoints;
        this.strength = strength;
    }

    public void attack(int damage, ILoseHealth target){
        target.loseHealth(damage);
    }

    public String getSpecies() {
        return species;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void loseHealth(int damage){
        this.healthPoints -= damage;
    }


}
