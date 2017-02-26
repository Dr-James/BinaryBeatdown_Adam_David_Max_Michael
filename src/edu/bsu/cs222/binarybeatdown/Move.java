package edu.bsu.cs222.binarybeatdown;

public class Move {

    private String definition;
    private String moveName;
    private int hitChance;
    private int damage;
    private String damageType;

    public Move() {
        this.moveName = "Nothing";
        this.definition = "This move does nothing!";
        this.hitChance = 0;
        this.damage = 0;
        this.damageType = "Neither!";
    }

    public Move(String moveName, String moveDefinition, int moveHitChance, int moveDamage, String damageType) {
        this.moveName = moveName;
        this.definition = moveDefinition;
        this.hitChance = moveHitChance;
        this.damage = moveDamage;
        this.damageType = damageType;
    }

    public String getMoveName() {
        return this.moveName;
    }

    public String getMoveDefinition() {
        return this.definition;
    }


    public int getMoveHitChance() {
        return this.hitChance;
    }

    public int getMoveDamage() {
        return this.damage;
    }

    public String getMoveDamageType(){
        return this.damageType;
    }


}
