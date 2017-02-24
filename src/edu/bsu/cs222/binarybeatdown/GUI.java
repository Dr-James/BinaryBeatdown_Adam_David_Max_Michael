package edu.bsu.cs222.binarybeatdown;

import java.util.Scanner;

public class GUI {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = in.nextLine();
        String userIntro = "I'm " + userName;
        Move basicAdam = new Move();
        Move basicDavid = new Move();
        Move meh = new Move();
        Move die = new Move();
        Move[] moveSet= new Move[]{basicAdam, basicDavid, meh, die};
        CharacterCreator userCharacter = new CharacterCreator(userName, userIntro, 100, moveSet);
        System.out.println("Your name is " + userCharacter.getName() + ".\nYour health is " + userCharacter.getHealth() + "!\n");
        System.out.println("Your known moves are: "+ userCharacter.getMoveSet()[0].getMoveName() + ", "+ userCharacter.getMoveSet()[1].getMoveName() +
                ", "+ userCharacter.getMoveSet()[2].getMoveName() + ", and "+ userCharacter.getMoveSet()[3].getMoveName() + "!");
    }
}
  //  public CharacterCreator(String characterName, String characterIntro, int characterHealth, Move[] characterMoveSet)