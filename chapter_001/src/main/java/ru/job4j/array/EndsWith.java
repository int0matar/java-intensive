package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int wordListAlignment = word.length - post.length;

        for (int index = 0; index < post.length; index++) {
            if (word[index + wordListAlignment] != post[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}