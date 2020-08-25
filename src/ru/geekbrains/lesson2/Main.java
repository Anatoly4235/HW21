package ru.geekbrains.lesson2;

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        System.out.println("Домашнее задание 24.08.2020");
        System.out.println("Задание №1. Зеркалим элементы массива");

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        ;
        System.out.println();
        System.out.println("Задание №2. Заполняем массив с помощью цикла");


        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = i * 3;
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.println("Задание №3. Умноженин чисел ниже 6 на 2");

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");

        }

        System.out.println();
        System.out.println("Задание №4. Заполнить диаганаль двумерного массива единицами");
        int[][] arr3 = new int[5][5];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i == j || (i + j) == arr3.length - 1) {
                    arr3[i][j] = 1;
                }

                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("Задание №5. Найти максимальное число в одномерном массиве");


//        array1();


        int arr4[] = {
                17, 4, 9, 20, 1, 0, 18, 1, 29, 7
        };
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
            if (arr4[i] < min) {
                min = arr4[i];
            }
            System.out.print(arr4[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);


        System.out.println("Задание №6. Сравнение сумм в массиве");


        int sumRight = 0;
        int sumRight1 = 0;
        int sumRight2 = 0;
        int sumLeft = 0;
        int sumLeft1 = 0;
        int sumLeft2 = 0;


        Random random = new Random();
        int[] arr5 = new int[5];

        for (int i = 0; i < arr5.length; i++) {

            arr5[i] = random.nextInt(10);
            System.out.print(arr5[i] + " ");

        }
        System.out.println();

        sumRight = arr5[1] + arr5[2] + arr5[3] + arr5[4];
        sumRight1 = arr5[2] + arr5[3] + arr5[4];
        sumRight2 = arr5[3] + arr5[4];
        sumLeft = arr5[0] + arr5[1] + arr5[2] + arr5[3];
        sumLeft1 = arr5[0] + arr5[1] + arr5[2];
        sumLeft2 = arr5[0] + arr5[1];

        if (sumRight == arr5[0] || sumRight1 == sumLeft2 || sumRight2 == sumLeft1 || arr5[4] == sumLeft) {
            System.out.println("В массиве сумма левой и правой части равны");
        } else System.out.println("В Массиве нет равных частей");


        System.out.println();


        System.out.println("Задание №7. Смещение элементов массива");


        int[] arr6 = {2, 1, 5, 4, 3, 9};
        System.out.println(Arrays.toString(arr6));
        arrayN(arr6, 2);

    }


    private static void arrayN(int[] arr6, int n) {
//      Проходим по циклу
//      меняем местами элементы массива
        int l = n;

        for (int i = 0; i < arr6.length; i++) {
            if (i < n) {

                int temp = arr6[i];
                arr6[i] =  arr6[arr6.length-l];
                arr6[arr6.length-l] = temp;
                l--;
            }


        }

        System.out.println(Arrays.toString(arr6));

    }

}




