package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int firstPairResult = first > second ? first : second;
        return firstPairResult > third ? firstPairResult : third;
    }
}