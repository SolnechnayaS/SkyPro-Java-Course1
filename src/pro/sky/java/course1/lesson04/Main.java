package pro.sky.java.course1.lesson04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 18;
        if (age <18)
        {
            System.out.println("Если человеку меньше 18 лет, то он несовершеннолетний. Вам " + age + " лет, следовательно Вы несовершеннолетний");
        }
        else
        {System.out.println("Если человеку больше 18 лет, то он совершеннолетний. Вам " + age + " лет, следовательно Вы совершеннолетний");}
    }
    public static void task2() {
        System.out.println("Задача 2");

        int temperature = 4;
        if (temperature <5)
        {
            System.out.println("Сегодня температура воздуха  " + temperature + " градусов. На улице холодно, нужно надеть шапку");
        }
        else
        {System.out.println("Сегодня температура воздуха  " + temperature + " градусов.  Тепло, можно идти без шапки");}

    }
    public static void task3() {
        System.out.println("Задача 3");


        int speed = 60;
        if (speed <=60)
        {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        else
        {System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");}

    }
    public static void task4() {
        System.out.println("Задача 4");

        double age = 15;
        boolean babyAge = age<2;
        boolean kindergartenAge = age>=2 && age <=6;
        boolean scoolAge = age>6 && age <=18;
        boolean universityAge = age>18 && age <24;
        boolean jobAge = age>=24;

        if (babyAge)
        {
            System.out.println("Тебе всего " + age + " года. Сиди дома с мамой!");
        }
        else if (kindergartenAge)
        {
            System.out.println("В " + age + " года - пора ходить в детский сад");
        }
        else if (scoolAge)
        {
            System.out.println("В " + age + " лет - время учиться в школе");
        }
        else if (universityAge)
        {
            System.out.println("В " + age + " лет - пора бы в универ");
        }
        else if (jobAge)
        {
            System.out.println("В " + age + " лет: иди-ка работать, дружок");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        double age = 13.9;
        boolean babyAge = age<5;
        boolean maintainerAge = age>=5 && age <14;
        boolean noMaintainerAge = age>=14;

        if (babyAge)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if (maintainerAge)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (noMaintainerAge)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int people = 61;
        int allPlace = 102;
        int sitPlace = 60;

        int standingPlace = allPlace-sitPlace;
        int standingPlaceFree = standingPlace - (people-sitPlace);
        int sitPlaceFree = sitPlace - people;

        boolean sit = people<=sitPlace;
        boolean standing = people>sitPlace && people<=allPlace;
        boolean overload = people>allPlace;

        if (sit)
        {
            System.out.println("Если в вагон вошло " + people + " человек, то можно сесть. Свободных мест для сидения " + sitPlaceFree);
        }
        else if (standing)
        {
            System.out.println("Если в вагон вошло " + people + " человек, то в вагоне плотно, но можно ехать стоя. Свободных мест для стояния " + standingPlaceFree);
        }
        else if (overload)
        {
            System.out.println("Если в вагон вошло " + people + " человек, то свободных мест нет, подожди следующий поезд");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int one = 88;
        int two = 101;
        int three = 55;

        boolean oneMax = one >= two &&  one >= three;
        boolean twoMax = two >= three &&  two >= one;
        boolean threeMax = three >= two &&  three >= one;

        if (oneMax)
        {
            System.out.println("Наибольшее число " + one);
        }
        else if (twoMax)
        {
            System.out.println("Наибольшее число " + two);
        }
        else if (threeMax)
        {
            System.out.println("Наибольшее число " + three);
        }
    }
}