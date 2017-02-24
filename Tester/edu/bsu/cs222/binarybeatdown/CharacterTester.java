package edu.bsu.cs222.binarybeatdown;

import org.junit.Assert;
import org.junit.Test;

import static edu.bsu.cs222.binarybeatdown.CharacterCreator.generateOpponentArray;

public class CharacterTester {

    private CharacterCreator nullCharacter = new CharacterCreator();

    private CharacterCreator createPaul() {
        String name = "Paul";
        String intro = "I am Paul!";
        int health = 150;
        Move[] moveSet = {new Move(), new Move(), new Move(), new Move()};
        return new CharacterCreator(name, intro, health, moveSet);
    }

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
    public void paulNameTester() {
        Assert.assertEquals("Paul", createPaul().getName());
    }

    @Test
    public void paulIntroTester() {
        Assert.assertEquals("I am Paul!", createPaul().getIntro());
    }


    @Test
    public void paulStatsTester() {
        Assert.assertEquals(150, createPaul().getHealth());
    }

    @Test
    public void paulMoveSetTester() {
        Assert.assertEquals("Moves: Nothing, Nothing, Nothing, Nothing", createPaul().getMoveSet());
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
