package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] shortNumbers = new short[10];
        float[] floatNumbers = new float[40];

        String[] names = new String[3];
        names[0] = "Roman Bukin";

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
}
