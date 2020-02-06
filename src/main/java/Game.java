import Behaviours.ILoseHealth;
import Characters.PlayerCharacter;
import Monster.Monster;

import java.util.ArrayList;

public class Game {

    private ArrayList<PlayerCharacter> players;
    private ArrayList<Monster> monsters;
//    private Planet planet;

    public Game(){
        this.players = new ArrayList<>();
        this.monsters = new ArrayList<>();
    }

    public void addPlayer(PlayerCharacter player){
        this.players.add(player);
    }

    public void addMonster(Monster monster){
        this.monsters.add(monster);
    }

    public int countPlayers(){
        return this.players.size();
    }

    public int countMonsters() {
        return this.monsters.size();
    }

    public boolean checkPulse(ILoseHealth fighter){
         return (fighter.getHealthPoints() > 0);
    }


}
