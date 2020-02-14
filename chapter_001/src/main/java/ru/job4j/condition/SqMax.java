package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        //                    6          4           7          5
        int result = third;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = third;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = first;
            }
        } else if (third > forth) {
            result = second;
        }
        return result;
    }
}