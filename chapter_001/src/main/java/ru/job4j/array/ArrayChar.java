package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        char wordArr0 = word[0];
        char wordArr1 = word[1];
        char prefArr0 = pref[0];
        char prefArr1 = pref[1];

        if (wordArr0 == prefArr0) {
            if (wordArr1 == prefArr1) {
                result = true;
            }
        }
        return result;
    }
}