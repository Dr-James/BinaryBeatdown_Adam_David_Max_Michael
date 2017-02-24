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

    public CharacterCreator[] generatePlayableCharacterArray() {
        CharacterCreator Adam = new CharacterCreator("Adam", "I'm Adam!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator David = new CharacterCreator("David", "I'm David!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Max = new CharacterCreator("Max", "I'm Max!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Michael = new CharacterCreator("Michael", "I'm Michael!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        return new CharacterCreator[]{Adam, David, Max, Michael};
    }

    protected CharacterCreator[] generateOpponentArray() {
        CharacterCreator Dave = new CharacterCreator("Dave", "I'm Dave Largent!", "Clean Code", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Jeff = new CharacterCreator("Jeff", "I'm Jeff Zhang!", "Whatever We Want", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Nicolas = new CharacterCreator("Nicolas", "I'm Nicolas Renet!", "Algorithm", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Mystery = new CharacterCreator("Mr. E", "I'm Mr. E!", "Depends on who we pick", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        return  new CharacterCreator[]{Dave, Jeff, Nicolas, Mystery};
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
