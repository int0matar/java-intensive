package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(174);
        System.out.println("Man 174 is: " + man);

        double woman = Fit.womanWeight(168);
        System.out.println("Woman 168 is: " + woman);
    }
}