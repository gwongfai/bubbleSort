package com.zgh;


import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 45, 20, 48, 65, 100, 25, 3, 78, 98, 54, 63};
        bubbleSortMain(array);
        System.out.println(Arrays.toString(array));

    }

    private static void bubbleSortMain(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
