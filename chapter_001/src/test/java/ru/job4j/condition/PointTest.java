package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x2 = 0, x1 = 0, y2 = 2, y1 = 0;
        double expected = 2.0;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(expected, out, 0.01);
    }
}