package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp =  data[0];

        for (int index = data.length-1; index >= 0; index--) {
            if (temp != data[index]) {
                result = false;
            }
        }
        return result;
    }
}