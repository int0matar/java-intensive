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

        int inRubleToEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inRubleToEuro);
        boolean passedRubleToEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedRubleToEuro);

        int inRubleToDollar = 120;
        int expectedDollar = 2;
        int outDollar = rubleToDollar(inRubleToDollar);
        boolean passedRubleToDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2. Test result : " + passedRubleToDollar);

        int inEuroToRuble = 2;
        int expectedRuble = 140;
        int outRuble = euroToRuble(inEuroToRuble);
        boolean passedEuroToRuble = expectedRuble == outRuble;
        System.out.println("2 rubles are 140. Test result : " + passedEuroToRuble);

        // Тест не пройден.
        int inDollarToRuble = 2;
        int expectedRuble2 = 121;
        int outRuble2 = dollarToRuble(inDollarToRuble);
        boolean passedDollarToRuble = expectedRuble2 == outRuble2;
        System.out.println("2 rubles are 121. Test result : " + passedDollarToRuble);
    }
}