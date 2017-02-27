package edu.bsu.cs222.binarybeatdown;

public class MoveSuite {

    //Dave Moves
    public static Move cleanCode() {
        String name = "Clean Code";
        String definition = "Clean code is beautiful. Cleaning code is pain.";
        int hitChance = 8;
        int damage = 15;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move fixMaster() {
        String name = "Fix It";
        String definition = "Fixing your issues is helpful, but shames you!";
        int hitChance = 5;
        int damage = 10;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move pairProgram() {
        String name = "Pair Programming";
        String definition = "Double the coders, double the damage!";
        int hitChance = 13;
        int damage = 25;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move question() {
        String name = "Question";
        String definition = "Sometimes questions can find you at a loss!";
        int hitChance = 5;
        int damage = 12;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }
    //End of Dave's sets of moves

    //Adam Moves
    public static Move deleteCode(){
        String name = "Delete Code";
        String definition = "You delete some of your opponents code!";
        int hitChance = 15;
        int damage = 5;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move throwComputer(){
        String name = "Throw Computer";
        String definition = "You become so frustrated, you throw your computer!";
        int hitChance = 1;
        int damage = 25;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move pushCode(){
        String name = "Push Code";
        String definition = "You push some of your opponents code to GitHub... it ruins their code!";
        int hitChance = 10;
        int damage = 15;
        String damageType = "subHealth";
        return new Move(name, definition,  hitChance, damage, damageType);
    }

    public static Move quickSort(){
        String name = "Quick Sort";
        String definition = "You quickly sort your thoughts, and dealAttackDamage!";
        int hitChance = 20;
        int damage = 5;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }
    //End of Adam's set of moves

    //David Moves
    public static Move  aptGet() {
        String name = "apt-get";
        String definition = "You apt-get upgrade, surpassing your opponents!";
        int hitChance = 8;
        int damage = 18;
        String damageType = "subHealth";
        return new Move(name, definition,  hitChance, damage, damageType);
    }

    public static Move drinkCoffee() {
        String name = "Drink Coffee";
        String definition = "You get a drink of coffee, and code for hours!";
        int hitChance = 3;
        int damage = 15;
        String damageType = "addHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move solveAlgorithm() {
        String name = "Solve Algorithm";
        String definition = "You figured out an algorithm, and now your program runs more efficiently than your opponents!";
        int hitChance = 5;
        int damage = 12;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move refactor() {
        String name = "Refactor";
        String definition = "You refactor your opponents messy code, and claim it as your own!";
        int hitChance = 6;
        int damage = 10;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }
    //End of David's set of moves

    //Michael Moves
    public static Move cardiacArrest() {
        String name = "Cardiac Arrest";
        String definition = "You taunt your opponent, forcing them to chase after you. Having adept stamina, your opponent runs after you, sending them into a brief cardiac arrest!";
        int hitChance = 2;
        int damage = 4;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move dualBootBarrage() {
        String name = "Dual Boot Barrage";
        String definition = "You boot two instances of yourself and relay a flurry of karate chops!";
        int hitChance = 6;
        int damage = 18;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move hibernate() {
        String name = "Hibernate";
        String definition = "You oversleep for class, but regain some health due to the extra rest!";
        int hitChance = 5;
        int damage = 8;
        String damageType = "addHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

    public static Move scissorKick() {
        String name = "Scissor Kick";
        String definition = "You launch your legs in the air and kick your opponent with a scissor motion!";
        int hitChance = 10;
        int damage = 12;
        String damageType = "subHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }
    //End of Michael's set of moves

    public static Move eatSnack(){
        String name = "Eat Snack";
        String definition = "You eat a snack, and feel reinvigorated!";
        int hitChance = 1;
        int damage = 15;
        String damageType = "addHealth";
        return new Move(name, definition, hitChance, damage, damageType);
    }

}
