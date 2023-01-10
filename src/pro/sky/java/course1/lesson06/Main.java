package pro.sky.java.course1.lesson06;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1: С помощью цикла for выведите в консоль все числа от 1 до 10.");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2: С помощью цикла for выведите в консоль все числа от 10 до 1.");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3: Выведите в консоль все четные числа от 0 до 17.");

        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4: Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.");

        int N = 10;
        for (int i = N; i >= -N; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5: Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».");

        int start = 1904;
        int finish = 2096;
        for (int i = start; i <= finish; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6: Напишите программу, которая выводит в консоль последовательность чисел: 7 14 21 28 35 42 49 56 63 70 77 84 91 98");

        int start = 7;
        int finish = 98;
        for (int i = start; i <= finish; i = i + 7) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println();
    }

    public static void task7() {
        System.out.println("Задача 7: Напишите программу, которая выводит в консоль последовательность чисел: 1 2 4 8 16 32 64 128 256 512");
        int start = 1;
        int finish = 512;
        for (int i = start; i <= finish; i = i * 2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задача 8: Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».\n" +
                "Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».");
        int bank = 0;
        int salary = 29000;
        int months = 12;

        for (int i = 1; i <= months; i++) {
            bank = bank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Задача 9: Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».");

        double bank = 0;
        double salary = 29000;
        int months = 12;
        double yieldMonth = 0.01;

        for (int i = 1; i <= months; i++) {
            bank = bank * (1 + yieldMonth);
            bank = bank * 100; // округление до 2-х знаков
            bank = Math.round(bank); // округление до 2-х знаков
            bank = bank / 100; // округление до 2-х знаков
            bank = bank + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " рублей");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Задача 10: Напишите программу, которая выводит в консоль таблицу умножения на 2");

        int start = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(start + " * " + i + " = " + (start * i));
        }
    }
}