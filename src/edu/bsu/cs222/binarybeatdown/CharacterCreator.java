package edu.bsu.cs222.binarybeatdown;

import java.util.ArrayList;

public class CharacterCreator {

    private String attribute;
    private String intro;
    private String name;
    //private ImageInputStream picture;
    private ArrayList<Integer> stats = new ArrayList<>(2);
    private int health;
    private int speed;
    private Move[] moveSet;


    public CharacterCreator() {
        this.name = "";
        this.intro = "";
        this.attribute = "";
        health = 0;
        speed = 0;
        this.stats.add(0, health);
        this.stats.add(1, speed);
        this.moveSet = new Move[]{new Move(), new Move(), new Move(), new Move()};
        //image = emptyCanvas
    }

    public CharacterCreator(String characterName, String characterIntro, String characterAttribute, int characterHealth, int characterSpeed, Move[] characterMoveSet) {
        this.name = characterName;
        this.intro = characterIntro;
        this.attribute = characterAttribute;
        this.stats.add(0, characterHealth);
        this.stats.add(1, characterSpeed);
        this.moveSet = characterMoveSet;
    }

    public String getName() {
        return this.name;
    }

    public String getIntro(){
        return this.intro;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public String getStats() {
        return "Health: " +this.stats.get(0) + " Speed: " +this.stats.get(1);
    }

    public String getMoveSet() {
        return "Moves: " + this.moveSet[0].getMoveName() + ", " + this.moveSet[1].getMoveName() + ", " + this.moveSet[2].getMoveName() + ", " + this.moveSet[3].getMoveName();
    }
}
