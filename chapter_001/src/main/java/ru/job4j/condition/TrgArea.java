package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        // s = sqrt(p(p - a)(p - b)(p - c)) - Корень из 4 множителей.
        // p - Полу периметр.
        // a, b, c - Длина сторон.

        // p = a + b + c / 2 - Формула вычисления полу периметра.

        double sumABC = a + b + c;
        double semiPerimeter = sumABC / 2;

        double pA = semiPerimeter - a;
        double pB = semiPerimeter - b;
        double pC = semiPerimeter - c;

        return Math.sqrt(semiPerimeter*pA*pB*pC);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    } // area (2, 2, 2) = 1.7320508075688772
}