package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];

        for (int index = 0; index < rst.length; index++) {
            rst[index] = index * index;
        }
        return rst;
    }
}
