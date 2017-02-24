package edu.bsu.cs222.binarybeatdown;

import java.util.ArrayList;

public class CharacterCreator {

    private String intro;
    private String name;
    //private ImageInputStream picture;
    private int health;
    private Move[] moveSet;


    public CharacterCreator() {
        this.name = "";
        this.intro = "";
        this.health = 0;
        this.moveSet = new Move[]{new Move(), new Move(), new Move(), new Move()};
    }

    public CharacterCreator(String characterName, String characterIntro, int characterHealth, Move[] characterMoveSet) {
        this.name = characterName;
        this.intro = characterIntro;
        this.health = characterHealth;
        this.moveSet = characterMoveSet;
    }

    public static CharacterCreator[] generateOpponentArray() {
        CharacterCreator Adam = new CharacterCreator("Adam", "I'm Adam!", 100, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator David = new CharacterCreator("David", "I'm David!", 100, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Max = new CharacterCreator("Max", "I'm Max!", 100, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Michael = new CharacterCreator("Michael", "I'm Michael!", 100, new Move[]{new Move(), new Move(), new Move(), new Move()});
        return new CharacterCreator[]{Adam, David, Max, Michael};
    }


    public String getName() {
        return this.name;
    }

    public String getIntro() {
        return this.intro;
    }

    public int getHealth() {
        return this.health;
    }

    public Move[] getMoveSet() {
        return this.moveSet;
    }
}
