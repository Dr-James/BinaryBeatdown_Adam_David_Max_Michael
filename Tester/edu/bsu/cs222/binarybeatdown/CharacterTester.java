package edu.bsu.cs222.binarybeatdown;

import org.junit.Assert;
import org.junit.Test;

import static edu.bsu.cs222.binarybeatdown.CharacterCreator.generateOppenentArray;

public class CharacterTester {

    private CharacterCreator nullCharacter = new CharacterCreator();

    private CharacterCreator createPaul() {
        String name = "Paul";
        String intro = "I am Paul!";
        String attribute = "Algorithms";
        int health = 150;
        int speed = 50;
        Move[] moveSet = {new Move(), new Move(), new Move(), new Move()};
        return new CharacterCreator(name, intro, attribute, health, speed, moveSet);
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
    public void characterNoAttributeTester() {
        Assert.assertEquals("", nullCharacter.getAttribute());
    }

    @Test
    public void characterNoStatsTester() {
        Assert.assertEquals("Health: 0 Speed: 0", nullCharacter.getStats());
    }

    @Test
    public void characterNoMoveSetTester() {
        Assert.assertEquals("Moves: Nothing, Nothing, Nothing, Nothing", nullCharacter.getMoveSet());
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
    public void paulAttributeTester() {
        Assert.assertEquals("Algorithms", createPaul().getAttribute());
    }

    @Test
    public void paulStatsTester() {
        Assert.assertEquals("Health: 150 Speed: 50", createPaul().getStats());
    }

    @Test
    public void paulMoveSetTester() {
        Assert.assertEquals("Moves: Nothing, Nothing, Nothing, Nothing", createPaul().getMoveSet());
    }

    @Test
    public void generateOpponentArrayTester() {
        CharacterCreator[] arrayOfCharacters = generateOppenentArray();
        CharacterCreator Adam = new CharacterCreator("Adam", "I'm Adam!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator David = new CharacterCreator("David", "I'm David!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Max = new CharacterCreator("Max", "I'm Max!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        CharacterCreator Michael = new CharacterCreator("Michael", "I'm Michael!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
        Assert.assertEquals(Adam.getName(), arrayOfCharacters[0].getName());
    }



}
