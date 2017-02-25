package edu.bsu.cs222.binarybeatdown;

import org.junit.Assert;
import org.junit.Test;

import static edu.bsu.cs222.binarybeatdown.CharacterCreator.generateOpponentArray;
import static edu.bsu.cs222.binarybeatdown.CharacterCreator.initializeDave;

public class CharacterTester {

    private CharacterCreator nullCharacter = new CharacterCreator();

    @Test
    public void characterNoNameTester() {
        Assert.assertEquals("", nullCharacter.getName());
    }

    @Test
    public void characterNoIntroTester() {
        Assert.assertEquals("", nullCharacter.getIntro());
    }


    @Test
    public void characterNoStatsTester() {
        Assert.assertEquals(0, nullCharacter.getHealth());
    }

    @Test
    public void characterNoMoveSetIndex0Tester() {
        Assert.assertEquals("Nothing", nullCharacter.getMoveSet()[0].getMoveName());
    }

    @Test
    public void daveNameTester() {
        Assert.assertEquals("Dave", initializeDave().getName());
    }

    @Test
    public void daveIntroTester() {
        Assert.assertEquals("I'm Professor Dave Largent, champion of clean code and master of words and puns!", initializeDave().getIntro());
    }


    @Test
    public void daveHealthTester() {
        Assert.assertEquals(150, initializeDave().getHealth());
    }

    @Test
    public void daveMoveSetTester() {
        CharacterCreator dave = initializeDave();
        String daveMoves = dave.getMoveSet()[0].getMoveName() + ", " + dave.getMoveSet()[1].getMoveName() + ", " + dave.getMoveSet()[2].getMoveName() + ", " + dave.getMoveSet()[3].getMoveName();
        Assert.assertEquals("Pair Programming, Clean Code, Question, Fix It", daveMoves);
    }

    @Test
    public void generateOpponentArrayIndex0Tester() {
        CharacterCreator[] arrayOfCharacters = generateOpponentArray();
        CharacterCreator Adam = new CharacterCreator("Adam", "I'm Adam!", 100, new Move[]{new Move(), new Move(), new Move(), new Move()});
        Assert.assertEquals(Adam.getName(), arrayOfCharacters[0].getName());
    }

    @Test
    public void generateOpponentArrayIndex3Tester() {
        CharacterCreator[] arrayOfCharacters = generateOpponentArray();
        CharacterCreator Michael = new CharacterCreator("Michael", "I'm Michael!", 100, new Move[]{new Move(), new Move(), new Move(), new Move()});
        Assert.assertEquals(Michael.getName(), arrayOfCharacters[3].getName());
    }



}
