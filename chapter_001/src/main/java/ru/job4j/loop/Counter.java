package ru.job4j.loop;

public class Counter {
    // for (int index = НАЧАЛЬНОЕ_ЗАЧЕНИЕ; index <= КОНЕЧНОЕ_ЗНАЧЕНИЕ; index++) {}

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(4, 24));
        System.out.println(sum(57, 124));
    }
}