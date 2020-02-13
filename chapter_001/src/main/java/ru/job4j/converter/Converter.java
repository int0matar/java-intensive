package ru.job4j.converter;

public class Converter {
    // 1 доллар = 60 рублей.
    // 1 евро = 70 рублей.

    public static int rubleToEuro(int value) { return value / 70; }

    public static int rubleToDollar(int value) { return value / 60; }

    public static int euroToRuble(int value) { return value * 70; }

    public static int dollarToRuble(int value) { return value * 60; }

    public static void main(String[] args) {

        int ConvertRubleToEuro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + ConvertRubleToEuro + " euro.");

        int ConvertRubleToDollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + ConvertRubleToDollar + " dollar.");

        int ConvertEuroToRuble = Converter.euroToRuble(2);
        System.out.println("2 euro are " + ConvertEuroToRuble + " rubles.");

        int ConvertDollarToRuble = Converter.dollarToRuble(2);
        System.out.println("2 dollar are " + ConvertDollarToRuble + " rubles.");
    }
}