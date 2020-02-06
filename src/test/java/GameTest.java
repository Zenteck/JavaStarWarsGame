import Characters.Jedi;
import Gear.Lightsaber;
import Monster.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Jedi jedi;
    private Lightsaber lightsaber;
    private Monster monster;

    @Before
    public void before() {
        game = new Game();
        jedi = new Jedi("Obi Wan", true, 88);
        monster = new Monster("Rancor", 100, 40);
    }

    @Test
    public void canAddPlayerToGame(){
        game.addPlayer(jedi);
        game.addPlayer(jedi);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void canAddMonsterToGame(){
        game.addMonster(monster);
        game.addMonster(monster);
        assertEquals(2, game.countMonsters());
    }

    @Test
    public void jediCanAttackMonster(){
        jedi.attack(jedi.getWeaponDamage(), monster);
        assertEquals(30, monster.getHealthPoints());
    }

    @Test
    public void monsterCanAttackJedi(){
        monster.attack(monster.getStrength(), jedi);
        assertEquals(60, jedi.getHealthPoints());
    }

    @Test
    public void testFight(){
        jedi.attack(jedi.getWeaponDamage(), monster);
        jedi.attack(jedi.getWeaponDamage(), monster);
        monster.attack(monster.getStrength(), jedi);
        monster.attack(monster.getStrength(), jedi);
        assertEquals(true, game.checkPulse(jedi));
        assertEquals(false, game.checkPulse(monster));
    }





}


