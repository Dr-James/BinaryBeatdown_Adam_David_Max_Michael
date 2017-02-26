package edu.bsu.cs222.binarybeatdown;

import java.util.Scanner;

import static edu.bsu.cs222.binarybeatdown.Battle.battle;
import static edu.bsu.cs222.binarybeatdown.CharacterCreator.initializeDave;
import static edu.bsu.cs222.binarybeatdown.CharacterCreator.initializeUser;

public class TemporaryMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = in.nextLine();
        CharacterCreator user = userSystemOut(userName);
        CharacterCreator dave = daveSystemOut();
        System.out.println("************************FIGHT!*********************\n");
        battle(user, dave);
    }

    private static CharacterCreator userSystemOut(String userName) {
        CharacterCreator user = initializeUser(userName);
        System.out.println(user.getIntro());
        System.out.println("Your known moves are: " + user.getMoveSet()[0].getMoveName() + ", " + user.getMoveSet()[1].getMoveName() +
                ", " + user.getMoveSet()[2].getMoveName() + ", and " + user.getMoveSet()[3].getMoveName() + "!\n");
        return user;
    }

    private static CharacterCreator daveSystemOut() {
        CharacterCreator Dave = initializeDave();
        System.out.println(Dave.getIntro());
        System.out.println("Dave's known moves are: " + Dave.getMoveSet()[0].getMoveName() + ", " + Dave.getMoveSet()[1].getMoveName() +
                ", " + Dave.getMoveSet()[2].getMoveName() + ", and " + Dave.getMoveSet()[3].getMoveName() + "!\n");
        return Dave;

    }


}
