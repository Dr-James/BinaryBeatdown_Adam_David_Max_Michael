package edu.bsu.cs222.binarybeatdown;

import java.util.Random;

import static edu.bsu.cs222.binarybeatdown.Battle.*;

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

    public static CharacterCreator initializeDave() {
        String name = "Dave";
        String definition = "I'm Professor Dave Largent, champion of clean code and master of words and puns!";
        int health = 150;
        Move[] moveSet = new Move[]{pairProgram(), cleanCode(), question(), fixMaster()};
        return new CharacterCreator(name, definition, health, moveSet);
    }

    public void attack(Move attack, CharacterCreator opponent) {
        Random random = new Random();
        int roll = random.nextInt(20) + 1;
        if (roll >= attack.getMoveHitChance()) {
            opponent.setHealth(attack.getMoveDamage());
        }
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

    public void setHealth(int damage) {
        this.health -= damage;
    }


}
