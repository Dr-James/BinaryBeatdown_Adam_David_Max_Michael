package edu.bsu.cs222.binarybeatdown;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    public static void battle(CharacterCreator user, CharacterCreator opponent) {
        Scanner in = new Scanner(System.in);
        int turnNumber = 1;
        while (user.getHealth() > 0 && opponent.getHealth() > 0) {
            System.out.println("Turn " + turnNumber);
            moveSelectAndAttack(user, opponent);
            if (opponent.getHealth() > 0)
                moveSelectAndAttack(opponent, user);
            System.out.println("User health is: " + user.getHealth());
            System.out.println("Opponent health is: " + opponent.getHealth());
            turnNumber++;
        }
        if (user.getHealth() <= 0)
            System.out.println("You've lost all of your health, and are eliminated from the Binary Beatdown!");
        else
            System.out.println("You have defeated your opponent, and move to the next round of the Binary Beatdown!");
    }

    //this is temporary for random battle move selection, it will need to be removed
    //player1 attacks player2
    private static void moveSelectAndAttack(CharacterCreator player1, CharacterCreator player2) {
        Random random = new Random();
        int roll = random.nextInt(3);
        player1.attack(player1.getMoveSet()[roll], player2);
    }

    //Dave's Set of Moves
    public static Move pairProgram() {
        String name = "Pair Programming";
        String definition = "Double the coders, double the damage!";
        int hitChance = 13;
        int damage = 25;
        return new Move(name, definition, hitChance, damage);
    }

    public static Move cleanCode() {
        String name = "Clean Code";
        String definition = "Clean code is beautiful. Cleaning code is pain.";
        int hitChance = 8;
        int damage = 15;
        return new Move(name, definition, hitChance, damage);
    }

    public static Move question() {
        String name = "Question";
        String definition = "Sometimes questions can find you at a loss!";
        int hitChance = 5;
        int damage = 12;
        return new Move(name, definition, hitChance, damage);
    }

    public static Move fixMaster() {
        String name = "Fix It";
        String definition = "Fixing your issues is helpful, but shames you!";
        int hitChance = 5;
        int damage = 10;
        return new Move(name, definition, hitChance, damage);
    }
    //ending of Dave's sets of moves

}
