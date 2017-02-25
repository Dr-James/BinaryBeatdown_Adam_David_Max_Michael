package edu.bsu.cs222.binarybeatdown;

import java.util.Random;

public class Battle {

    public void Attack(Move attack, CharacterCreator opponent) {
        Random random = new Random();
        int roll = random.nextInt(20) + 1;
        if (roll >= attack.getMoveHitChance()) {
            opponent.setHealth(attack.getMoveDamage());
        }
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
//    public Move() {
//        this.moveName = "Nothing";
//        this.definition = "This move does nothing!";
//        this.hitChance = 0;
//        this.damage = 0;
//    }