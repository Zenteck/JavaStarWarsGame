import Characters.Jedi;

import Gear.Lightsaber;
import Monster.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JediTest {

    private Jedi jedi;
    private Lightsaber lightsaber;
    private Monster monster;



    @Before
    public void before(){
        jedi = new Jedi("Obi Wan", true, 88);
        monster = new Monster("Rancor", 100, 40);
//        lightsaber = new Lightsaber("Blue");

    }

    @Test
    public void hasName(){
        assertEquals("Obi Wan", jedi.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, jedi.getHealthPoints());
    }

    @Test
    public void hasForceSide(){
        assertEquals(true, jedi.isLightDark());
    }

    @Test
    public void hasForcePower(){
        assertEquals(88, jedi.getForcePower());
    }



}
