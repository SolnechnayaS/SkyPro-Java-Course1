package pro.sky.java.course1.lesson02;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println ("Вес собаки " + dog + " кг");
        var cat =3.6;
        System.out.println ("Вес кота " + cat + " кг");
        var paper = 763789;
        System.out.println ("Вес бумаги " + paper + " кг");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        var supplementaryWeight = 4;
        var dog = 8;
        var newWeigthDog = dog+ supplementaryWeight;
        System.out.println ("Новый вес собаки " + newWeigthDog + " кг");
        var cat =3.6;
        var newWeigthCat= cat+ supplementaryWeight;

        System.out.println ("Новый вес кота " + newWeigthCat + " кг");
        var paper = 763789;
        var newWeigthPaper = paper+ supplementaryWeight;
        System.out.println ("Новый вес бумаги " + newWeigthPaper + " кг");

    }
    public static void task3 () {
        System.out.println("Задача 3");

        var supplementaryWeight = 4;

        var dog = 8;
        var newWeigthDog = dog+ supplementaryWeight;
        var weightLossDog = newWeigthDog  - 3.5;
        System.out.println ("Новый вес собаки после уменьшения " + weightLossDog + " кг");

        var cat =3.6;
        var newWeigthCat= cat+ supplementaryWeight;
        var weightLossCat = newWeigthCat  - 1.6;
        System.out.println ("Новый вес кота после уменьшения " + weightLossCat + " кг");

        var paper = 763789;
        var newWeigthPaper = paper+ supplementaryWeight;
        var weightLossPaper = newWeigthPaper - 7639;
        System.out.println ("Новый вес бумаги после уменьшения " + weightLossPaper + " кг");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println ("Значение переменной friend =  "+ friend);

        friend = friend+2;
        System.out.println ("Значение переменной friend после увеличения на 2 = " + friend);

        friend = friend/7;
        System.out.println ("Значение переменной friend после деления на 7 = " + friend);

    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println ("Значение переменной frog = " + frog);

        frog = frog*10;
        System.out.println ("Значение переменной frog после увеличения в 10 раз = " + frog);

        frog = frog /3.5;
        System.out.println ("Значение переменной frog после деления на 3,5 = " + frog);

        frog = frog +4;
        System.out.println ("Значение переменной frog после прибавления 4 = " + frog);

    }

    public static void task6 () {
        System.out.println("Задача 6");

        var firstBoxer = 78.2;
        System.out.println ("Вес первого боксера  = " + firstBoxer);

        var secondBoxer = 82.7;
        System.out.println ("Вес второго боксера  = " + secondBoxer);

        var sumWeigth = firstBoxer+ secondBoxer;
        System.out.println ("Общий вес двух боксеров = " + sumWeigth);

        var weightDifference = secondBoxer - firstBoxer;
        System.out.println ("Разница между весами бойцов = " + weightDifference);

    }

    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        System.out.println ("Вес первого боксера  = " + firstBoxer);

        var secondBoxer = 82.7;
        System.out.println ("Вес второго боксера  = " + secondBoxer);

        var weightDifferenceSubt = secondBoxer - firstBoxer;
        System.out.println ("Разница между весами бойцов с помощью оператора вычитания = " + weightDifferenceSubt);

        var weightDifferenceDiv= secondBoxer %firstBoxer;
        System.out.println ("Разница между весами бойцов с помощью оператора целочисленного деления = " + weightDifferenceDiv);

    }

    public static void task8 () {
        System.out.println("Задача 8");
        var operatingHoursAll = 640;
        var operatingHoursOne = 8;
        var numberEmployees = operatingHoursAll / operatingHoursOne;
        System.out.println ("Всего работников в компании — " + numberEmployees + " человек");

        var increaseEmployees = 94;
        numberEmployees = numberEmployees + increaseEmployees;
        operatingHoursAll = operatingHoursOne* numberEmployees;

        System.out.println ("Если в компании работает " + numberEmployees +" человек, то всего " + operatingHoursAll + " часов работы может быть поделено между сотрудниками");

    }
}

