package edu.bsu.cs222.binarybeatdown;

import org.junit.Assert;
import org.junit.Test;

public class MoveTester {

    private Move nullMove = new Move();
    private Move basicMove = new Move("Basic", "This is a basic dealAttackDamage!", 10, 95, "Loss");

    @Test
    public void nullMoveNameTester() {
        Assert.assertEquals("Nothing", nullMove.getMoveName());
    }

    @Test
    public void nullMoveDefinitionTester() {
        Assert.assertEquals("This move does nothing!", nullMove.getMoveDefinition());
    }

    @Test
    public void nullMoveHitChanceTester() {
        Assert.assertEquals(0, nullMove.getMoveHitChance());
    }

    @Test
    public void nullMoveDamageTester() {
        Assert.assertEquals(0, nullMove.getMoveDamage());
    }

    @Test
    public void basicMoveNameTester() {
        Assert.assertEquals("Basic", basicMove.getMoveName());
    }

    @Test
    public void basicMoveDefinitionTester() {
        Assert.assertEquals("This is a basic dealAttackDamage!", basicMove.getMoveDefinition());
    }

    @Test
    public void basicMoveHitChanceTester() {
        Assert.assertEquals(10, basicMove.getMoveHitChance());
    }

    @Test
    public void basicMoveDamageTester() {
        Assert.assertEquals(95, basicMove.getMoveDamage());
    }


}
