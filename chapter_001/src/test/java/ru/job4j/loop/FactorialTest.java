package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFactFiveEqualTwentyIterMinus() {
        Factorial fact = new Factorial();
        int result = fact.calcMinus(5);
        assertThat(result, is(120));
    }
    @Test
    public void whenFactZeroEqualOneIterMinus() {
        Factorial fact = new Factorial();
        int result = fact.calcMinus(0);
        assertThat(result, is(1));
    }
    @Test
    public void whenFactOneEqualOneIterMinus() {
        Factorial fact = new Factorial();
        int result = fact.calcMinus(1);
        assertThat(result, is(1));
    }

    @Test
    public void whenFactFiveEqualTwentyIterPlus() {
        Factorial fact = new Factorial();
        int result = fact.calcPlus(5);
        assertThat(result, is(120));
    }
    @Test
    public void whenFactZeroEqualOneIterPlus() {
        Factorial fact = new Factorial();
        int result = fact.calcPlus(0);
        assertThat(result, is(1));
    }
    @Test
    public void whenFactOneEqualOneIterPlus() {
        Factorial fact = new Factorial();
        int result = fact.calcPlus(1);
        assertThat(result, is(1));
    }
}