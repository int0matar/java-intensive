package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int number) {
        int count = 0;

        for (int index = 2; index <= number; index++) {
            if (CheckPrimeNumber.check(index)) {
                count++;
            }
        }
        return count;
    }
}