package com.democicd;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestCaculator {

    @Test
    public void testSum() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(3,3),6);

    }
    @Test
    public void testSub() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2,2),0);

    }
    @Test
    public void fail() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2,2),1);

    }
}
