package ru.job4j.loop;

public class Factorial {
    public static int calcMinus(int n) {
        // Negative iteration.
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static int calcPlus(int n) {
        // Positive iteration.
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}