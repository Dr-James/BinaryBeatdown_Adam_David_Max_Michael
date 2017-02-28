package edu.bsu.cs222.binarybeatdown;

import java.util.Random;
import java.util.Scanner;
import static edu.bsu.cs222.binarybeatdown.CharacterCreator.*;

public class Battle {

    static void battle(CharacterCreator user) {
        CharacterCreator Adam = initializeAdam();
        CharacterCreator David = initializeDavid();
        CharacterCreator Max = initializeMax();
        CharacterCreator Michael = initializeMichael();
        CharacterCreator Dave = initializeDave();
        int firstBattle = battleRound(user, Adam);
        if (firstBattle != 0) {
            if (battleVsEnemy(user, David) != 0) {
                if (battleVsEnemy(user, Max) != 0) {
                    if (battleVsEnemy(user, Michael) != 0) {
                        if (battleVsEnemy(user, Dave) != 0)
                            System.out.println("You are the Binary Beatdown Champion!");
                    }
                }
            }
        }
    }

    static int battleVsEnemy(CharacterCreator user, CharacterCreator opponent) {
        user.setHealth(150 - user.getHealth(), "addHealth");
        System.out.println("************************FIGHT!*********************\n");
        return battleRound(user, opponent);
    }

    static int battleRound(CharacterCreator user, CharacterCreator opponent) {
        int turnNumber = 1;
        characterHealthStatus(user, opponent);
        while (user.getHealth() > 0 && opponent.getHealth() > 0) {
            System.out.println("**************Turn " + turnNumber + "******************");
            turnBasedAttacks(user, opponent);
            turnNumber++;
        }
        return battleEndStatus(user);
    }

    private static void characterHealthStatus(CharacterCreator user, CharacterCreator opponent) {
        System.out.println(user.getName() + "'s health is: " + user.getHealth());
        System.out.println(opponent.getName() + "'s health is: " + opponent.getHealth());
    }

    private static void turnBasedAttacks(CharacterCreator user, CharacterCreator opponent) {
        chooseMoveAndAttack(user, opponent);
        if (opponent.getHealth() > 0)
            randomMoveSelectAndAttack(opponent, user);
        characterHealthStatus(user, opponent);
    }

    //this is temporary for random battle move selection, it will need to be removed: player1 attacks player2
    private static void randomMoveSelectAndAttack(CharacterCreator player1, CharacterCreator player2) {
        Random random = new Random();
        int roll = random.nextInt(3);
        Move attackMove = player1.getMoveSet()[roll];
        declareHitOrMiss(attackMove, player1, player2);
    }

    private static void chooseMoveAndAttack(CharacterCreator player1, CharacterCreator player2){
        int attack = selectAttack();
        Move attackMove = player1.getMoveSet()[attack];
        declareHitOrMiss(attackMove, player1,  player2);
    }

    private static int selectAttack() {
        System.out.println("Choose an attack!");
        Scanner attackChoice = new Scanner(System.in);
        return attackChoice.nextInt();
    }

    private static void declareHitOrMiss(Move attack, CharacterCreator user, CharacterCreator opponent){
        System.out.println(user.getName() + " used " + attack.getMoveName() + "!");
        if (checkIfHit(attack))
            dealAttackDamage(attack, user, opponent);
        else
            System.out.println("The attack misses!");
    }

    private static boolean checkIfHit(Move attack){
        Random random = new Random();
        int roll = random.nextInt(20) + 1;
        return (roll >= attack.getMoveHitChance());
    }

    private static void dealAttackDamage(Move attack, CharacterCreator user, CharacterCreator opponent) {
        if(attack.getMoveDamageType().equals("subHealth"))
            opponent.setHealth(attack.getMoveDamage(), "subHealth");
        else
            user.setHealth(attack.getMoveDamage(), "addHealth");
    }

    private static int battleEndStatus(CharacterCreator user) {
        if (user.getHealth() <= 0) {
            System.out.println("You've lost all of your health, and are eliminated from the Binary Beatdown!\n");
            return 0;
        }
        else {
            System.out.println("You have defeated your opponent, and move to the next round of the Binary Beatdown!\n");
            return 1;
        }
    }

}
