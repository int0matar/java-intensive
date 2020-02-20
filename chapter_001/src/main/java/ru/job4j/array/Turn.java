package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        //int[] reverse = array.clone();

        for (int index = 0; index < array.length/2; index++) {
            //int temp = reverse[index];
            int temp = array[index];


            array[index] = array[array.length-1-index];
            array[array.length-1-index] = temp;


        }
        return array;
    }
}