package com.democicd;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestCaculator {

    @Test
    public void testSum() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sum(2,3),6);

    }
    @Test
    public void testSub() {
        Caculator caculator = new Caculator();
        Assert.assertEquals(caculator.sub(2,2),0);

    }
}
