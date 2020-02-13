package ru.job4j.condition;

public class Point {
    public static double distance(int x2, int x1, int y2, int y1) {

        double powX2 = Math.pow(x2 - x1, 2);
        double powY2 = Math.pow(y2 - y1, 2);

        return Math.sqrt(powX2 + powY2);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    } // result (0, 0) to (2, 0) 2.0
}