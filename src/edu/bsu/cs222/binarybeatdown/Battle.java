package edu.bsu.cs222.binarybeatdown;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Battle {

    public static void battle(CharacterCreator user, CharacterCreator opponent) {
        int turnNumber = 1;
        characterHealthStatus(user, opponent);
        while (user.getHealth() > 0 && opponent.getHealth() > 0) {
            System.out.println("**************Turn " + turnNumber + "******************");
            turnBasedAttacks(user, opponent);
            turnNumber++;
        }
        battleEndStatus(user);
    }

    //this is temporary for random battle move selection, it will need to be removed
    //player1 attacks player2
    private static void randomMoveSelectAndAttack(CharacterCreator player1, CharacterCreator player2) {
        Random random = new Random();
        int roll = random.nextInt(3);
        Move attackMove = player1.getMoveSet()[roll];
        player1.attack(attackMove, player2);
        System.out.println(player1.getName() + " used " + attackMove.getMoveName() + "!");
    }

    private static void turnBasedAttacks(CharacterCreator user, CharacterCreator opponent) {
        chooseMoveAndAttack(user, opponent);
        if (opponent.getHealth() > 0)
            randomMoveSelectAndAttack(opponent, user);
        characterHealthStatus(user, opponent);
    }

    public static void chooseMoveAndAttack(CharacterCreator player1, CharacterCreator player2){
        int attack = selectAttack();
        Move attackMove = player1.getMoveSet()[attack];
        player1.attack(attackMove, player2);
        System.out.println(player1.getName() + " used " + attackMove.getMoveName() + "!");
    }

    private static int selectAttack() {
        System.out.println("Choose an attack!");
        Scanner attackChoice = new Scanner(System.in);
        return attackChoice.nextInt();
    }

    private static void characterHealthStatus(CharacterCreator user, CharacterCreator opponent) {
        System.out.println(user.getName() + "'s health is: " + user.getHealth());
        System.out.println(opponent.getName() + "'s health is: " + opponent.getHealth());
    }

    private static void battleEndStatus(CharacterCreator user) {
        if (user.getHealth() <= 0)
            System.out.println("You've lost all of your health, and are eliminated from the Binary Beatdown!");
        else
            System.out.println("You have defeated your opponent, and move to the next round of the Binary Beatdown!");
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

    public static Move throwComputer(){
        String name = "Throw Computer";
        String definition = "You become so frustrated, you throw your computer!";
        int hitChance = 1;
        int damage = 25;
        return new Move(name, definition, hitChance, damage);
    }

    public static Move quickSort(){
        String name = "Quick Sort";
        String definition = "You quickly sort your thoughts, and attack!";
        int hitChance = 20;
        int damage = 5;
        return new Move(name, definition, hitChance, damage);
    }

    public static Move deleteCode(){
        String name = "Delete Code";
        String definition = "You delete some of your opponents code!";
        int hitChance = 15;
        int damage = 5;
        return new Move(name, definition, hitChance, damage);
    }

    public static Move pushCode(){
        String name = "Push Code";
        String definition = "You push some of your opponents code to GitHub... it ruins their code!";
        int hitChance = 10;
        int damage = 15;
        return new Move(name, definition,  hitChance, damage);
    }

    public static Move  aptGet() {
        String name = "apt-get";
        String definition = "You apt-get upgrade, surpassing your opponents!";
        int hitChance = 8;
        int damage = 18;
        return new Move(name, definition,  hitChance, damage);
    }
}
