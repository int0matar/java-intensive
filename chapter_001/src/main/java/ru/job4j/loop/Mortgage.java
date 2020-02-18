package ru.job4j.loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double repayment = amount;
        while (repayment >= 0) {
            double salaryWithPercent = repayment + repayment * percent / 100;
            repayment = salaryWithPercent - salary * 12;
            year++;
        }
        return year;
    }
}