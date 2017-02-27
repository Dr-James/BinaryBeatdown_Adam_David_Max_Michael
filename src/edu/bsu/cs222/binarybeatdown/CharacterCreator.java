package edu.bsu.cs222.binarybeatdown;

import static edu.bsu.cs222.binarybeatdown.Battle.*;

public class CharacterCreator {

    private String intro;
    private String name;
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

    public static CharacterCreator initializeUser(String userName){
        String name  = userName;
        String definition = "You, " + userName + ", are the next Binary Beatdown challenger!";
        int health = 150;
        Move[] moveSet = new Move[]{throwComputer(), pushCode(), deleteCode(), eatSnack()};
        return new CharacterCreator(name, definition, health, moveSet);
    }

    public static CharacterCreator initializeAdam() {
        String name = "Adam";
        String definition = "I'm Adam, an expert Mathematician and Computer Scientist. But watch out, I have a temper! When I gets angry... I GETS ANGRY!";
        int health = 150;
        Move[] moveSet = new Move[]{deleteCode(), throwComputer(), pushCode(), quickSort()};
        return new CharacterCreator(name, definition, health, moveSet);
    }

    public static CharacterCreator initializeDave() {
        String name = "Dave";
        String definition = "I'm Professor Dave Largent, champion of clean code and master of words and puns!";
        int health = 150;
        Move[] moveSet = new Move[]{pairProgram(), cleanCode(), question(), fixMaster()};
        return new CharacterCreator(name, definition, health, moveSet);
    }

    public static CharacterCreator initializeDavid() {
        String name = "David";
        String definition = "I'm David, a wise-crack, coffee-powered coder. My room is clean, and so is my code. If you.WantToLose() == true, come at me!";
        int health = 150;
        Move[] moveSet = new Move[]{aptGet(), drinkCoffee(), solveAlgorithm(), refactor()};
        return new CharacterCreator(name, definition, health, moveSet);
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

    public void setHealth(int size, String damageType ) {
        if (damageType.equals("subHealth"))
            this.health -= size;
        else
            this.health += size;
    }


}
