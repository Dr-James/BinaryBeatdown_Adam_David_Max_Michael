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



    public Move cleanCode() {
        String name = "Clean Coding";
        String definition = "Clean code is beautiful. Cleaning code is pain.";
        int hitChance = 8;
        int damage = 15;
        return new Move(name, definition, hitChance, damage);
    }

    public Move question() {
        String name = "Question";
        String definition = "Sometimes questions can find you at a loss!";
        int hitChance = 5;
        int damage = 12;
        return new Move(name, definition, hitChance, damage);
    }

    public Move fixMaster() {
        String name = "Fix It";
        String definition = "Fixing your issues is helpful, but shames you!";
        int hitChance = 5;
        int damage = 10;
        return new Move(name, definition, hitChance, damage);
    }

}
//    public Move() {
//        this.moveName = "Nothing";
//        this.definition = "This move does nothing!";
//        this.hitChance = 0;
//        this.damage = 0;
//    }