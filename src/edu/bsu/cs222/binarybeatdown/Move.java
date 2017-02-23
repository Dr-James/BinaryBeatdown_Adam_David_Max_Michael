package edu.bsu.cs222.binarybeatdown;

import java.text.ParseException;

public class Move {

    private String attribute;
    private String definition;
    private String moveName;
    private int hitChance;
    private int damage;

    public Move() {
        this.moveName = "Nothing";
        this.definition = "This move does nothing!";
        this.attribute = "Lazy";
        this.hitChance = 0;
        this.damage = 0;
    }

    public Move(String moveName, String moveDefinition, String moveAttribute, int moveHitChance, int moveDamage) {
        this.moveName = moveName;
        this.definition = moveDefinition;
        this.attribute = moveAttribute;
        this.hitChance = moveHitChance;
        this.damage = moveDamage;
    }

    public String getMoveName() {
        return this.moveName;
    }

    public String getMoveDefintion() {
        return this.definition;
    }

    public String getMoveAttribute() {
        return this.attribute;
    }

    public int getMoveHitChance() {
        return this.hitChance;
    }

    public int getMoveDamage() {
        return this.damage;
    }

}
