package edu.bsu.cs222.binarybeatdown;

import java.util.Scanner;

import static edu.bsu.cs222.binarybeatdown.Battle.battle;
import static edu.bsu.cs222.binarybeatdown.CharacterCreator.initializeDave;

public class GUI {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = in.nextLine();
        CharacterCreator user = userSystemOut(userName);
        CharacterCreator dave = daveSystemOut();
        System.out.println("************************FIGHT!*********************\n");
        battle(user, dave);
    }



    private static CharacterCreator userSystemOut(String userName) {
        String userIntro = "I'm " + userName;
        Move[] moveSet= new Move[]{new Move(), new Move(), new Move(), new Move()};
        CharacterCreator userCharacter = new CharacterCreator(userName, userIntro, 100, moveSet);
        System.out.println("Your name is " + userCharacter.getName() + ".\nYour health is " + userCharacter.getHealth() + "!");
        System.out.println("Your known moves are: "+ userCharacter.getMoveSet()[0].getMoveName() + ", "+ userCharacter.getMoveSet()[1].getMoveName() +
                ", "+ userCharacter.getMoveSet()[2].getMoveName() + ", and "+ userCharacter.getMoveSet()[3].getMoveName() + "!\n");
        return userCharacter;
    }

    private static CharacterCreator daveSystemOut() {
        CharacterCreator Dave = initializeDave();
        System.out.println(Dave.getIntro());
        System.out.println("Dave's known moves are: " + Dave.getMoveSet()[0].getMoveName() + ", "+ Dave.getMoveSet()[1].getMoveName() +
                ", "+ Dave.getMoveSet()[2].getMoveName() + ", and "+ Dave.getMoveSet()[3].getMoveName() + "!\n");
        return Dave;
    }
}