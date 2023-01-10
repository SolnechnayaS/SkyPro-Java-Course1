package pro.sky.java.course1.lesson08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1: Объявите три массива:");
        System.out.println("Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(Arrays.toString(arr1));

        System.out.println("Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.");
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr2));

        System.out.println("Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.");
        int[] arr3 = new int[10];
        arr3[0] = 128;
        for (int i = 1; i < arr3.length; i++) {
            arr3[i] = arr3[i - 1] * 2;
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2: Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.");

        System.out.println("Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.");
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        System.out.println("Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.");
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        System.out.println("Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.");
        int[] arr3 = new int[10];
        arr3[0] = 128;
        for (int i = 1; i < arr3.length; i++) {
            arr3[i] = arr3[i - 1] * 2;
        }

        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3: Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.");

        System.out.println("Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.");
        int[] arr1 = {1, 2, 3};
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();

        System.out.println("Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.");
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();

        System.out.println("Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.");
        int[] arr3 = new int[10];
        arr3[0] = 128;
        for (int i = 1; i < arr3.length; i++) {
            arr3[i] = arr3[i - 1] * 2;
        }

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
                break;
            }
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();


        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4:  Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).");

        int[] arr1 = {1, 2, 3};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] % 2 == 1) {
                arr2[i] = arr1[i] + 1;
            } else {
                arr2[i] = arr1[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();

    }

}