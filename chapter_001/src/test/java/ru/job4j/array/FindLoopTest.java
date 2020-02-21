package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 3, 5, 4, 15, 64};
        int value = 15;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNoFindElementOfArray() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 3, 5, 4, 15, 64};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindIndexOf3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfRange(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindIndexOf2() {
        int[] input = new int[] {15, 2, 34, 3, 4, 5, 12, 4, 4, 4};
        int value = 34;
        int start = 0;
        int finish = 5;
        int result = FindLoop.indexOfRange(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }
}