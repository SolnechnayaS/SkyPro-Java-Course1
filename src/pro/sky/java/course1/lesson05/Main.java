package pro.sky.java.course1.lesson05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такая операционная система не поддерживается");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientDeviceYear>=2015)
        {
            switch (clientOS)
            {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Такая операционная система не поддерживается");
            }
        }
        else
        {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Такая операционная система не поддерживается");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        int year = 2100;
        boolean yearDividedFour = year%4==0;
        boolean yearDividedOneHundred = year%100==0;
        boolean yearDividedFourHundred = year%400==0;

        if (yearDividedFour)
        {

            if (yearDividedFourHundred)
            {
                System.out.println(year + " - это високосный год");
            }
            else if (yearDividedOneHundred)
            {
                System.out.println(year + " - это невисокосный год");
            }
            else
            {
                System.out.println(year + " - это високосный год");
            }

        }

        else
        {
            System.out.println(year + " - это невисокосный год");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;

        int notDeliveryDistance = 100;
        int deliveryDistanceOne = 20;
        int deliveryDistanceTwo = 60;

        int deliveryDayOne = 1;
        int deliveryDayTwo = deliveryDayOne +1;
        int deliveryDayThree = deliveryDayOne +2;

        if (deliveryDistance<=notDeliveryDistance)
        {
            if (deliveryDistance < deliveryDistanceOne)
            {
                System.out.println("Мы доставим Ваш заказ в течение " + deliveryDayOne + " дня");
            }
            else if (deliveryDistance < deliveryDistanceTwo)
            {
                System.out.println("Мы доставим Ваш заказ в течение " + deliveryDayTwo + " дней");
            }
            else
            {
                System.out.println("Мы доставим Ваш заказ в течение " + deliveryDayThree + " дней");
            }
        }

        else
        {
            System.out.println(deliveryDistance + " км находится за пределами нашей зоны доставки, мы не сможем доставить заказ");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber=12;

        switch (monthNumber)
        {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Месяца с таким номером не существует");
        }
    }

}