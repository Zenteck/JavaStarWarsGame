package Planets;

import Monster.Monster;

import java.util.ArrayList;

public class Planet {

    private String name;
    private ArrayList<Monster> monsters;

    public Planet(String name){
        this.name = name;
        this.monsters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void populateMonsters(Monster monster){
        this.monsters.add(monster);
    }

    public int countMonsters(){
        return this.monsters.size();
    }
}
