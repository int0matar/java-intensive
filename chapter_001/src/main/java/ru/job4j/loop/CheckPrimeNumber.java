package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        int division = 2;

        for(int index = 2; index < number; index++) {
            if((number % division) != 0) {
                division++;
            }
        }
        return division == number;
    }
}