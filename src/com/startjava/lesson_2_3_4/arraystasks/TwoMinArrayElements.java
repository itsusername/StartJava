package com.startjava.lesson_2_3_4.arraystasks;

import java.util.Random;

//два наименьших(минимальных) элемента массива.
public class TwoMinArrayElements {

    public static void main(String[] args) {
        int[] arr = new int[15];
        int i;
        int min1;
        int min2;
        Random generate = new Random();

        for (i=0; i < 15; i++) {
            arr[i] = generate.nextInt(100) + 1;
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");

        if (arr[0] < arr[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }

        for (i=2; i < arr.length; i++) {
            if (arr[i] < arr[min1]) {
                int buff = min1;
                min1 = i;
                if (arr[buff] < arr[min2]) {
                    min2 = buff;
                }
            } else {
                if (arr[i] <arr[min2]) {
                    min2 = i;
                }
            }

        }
        System.out.println("Минимальное значение №1. Индекс: arr[" + min1 + "]. Значение = " + arr[min1]);
        System.out.println("Минимальное значение №2. Индекс: arr[" + min2 + "]. Значение = " + arr[min2]);
    }
}