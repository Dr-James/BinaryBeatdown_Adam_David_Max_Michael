package edu.bsu.cs222.binarybeatdown;

import org.junit.Assert;
import org.junit.Test;

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

//    @Test
//    public void generatePlayableCharacterArrayTester() {
//        CharacterCreator[] arrayOfCharacters = generatePlayableCharacterArray();
//        CharacterCreator Adam = new CharacterCreator("Adam", "I'm Adam!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        CharacterCreator David = new CharacterCreator("David", "I'm David!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        CharacterCreator Max = new CharacterCreator("Max", "I'm Max!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        CharacterCreator Michael = new CharacterCreator("Michael", "I'm Michael!", "Student", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        Assert.assertArrayEquals(new CharacterCreator[]{Adam, David, Max, Michael}, arrayOfCharacters);
//    }
//
//    @Test
//    public void generateOpponentArrayTester() {
//        CharacterCreator[] arrayOfOpponents = generateOpponentArray();
//        CharacterCreator Dave = new CharacterCreator("Dave", "I'm Dave Largent!", "Clean Code", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        CharacterCreator Jeff = new CharacterCreator("Jeff", "I'm Jeff Zhang!", "Whatever We Want", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        CharacterCreator Nicolas = new CharacterCreator("Nicolas", "I'm Nicolas Renet!", "Algorithm", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        CharacterCreator Mystery = new CharacterCreator("Mr. E", "I'm Mr. E!", "Depends on who we pick", 100, 75, new Move[]{new Move(), new Move(), new Move(), new Move()});
//        Assert.assertArrayEquals(new CharacterCreator[]{Dave, Jeff, Nicolas, Mystery}, arrayOfOpponents);
//    }

}
