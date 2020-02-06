package Gear;

public class Lightsaber extends Weapon{

    private String colour;

    public Lightsaber(String colour) { ;
        this.colour = colour;
        this.setDamageValue(70);
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }



}
