package pro.sky.java.course1.lesson03;

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
        byte oneByte = 127;
        System.out.println ("Максимальное значение для типа byte равно " + oneByte);

        short twoShort = 32767;
        System.out.println ("Максимальное значение для типа short равно " + twoShort);

        int threeInt = 2147483647;
        System.out.println ("Максимальное значение для типа int равно " + threeInt);

        long fourLong = 9223372036854775807L;
        System.out.println ("Максимальное значение для типа long равно " + fourLong);

        float fiveFloat = 3.1415926f;
        System.out.println ("Максимальное значение знаков после запятой для числа Пи типа float равно "
                + fiveFloat);

        double sixDouble = 3.1415926535897932;
        System.out.println ("Максимальное значение знаков после запятой для числа Пи типа double равно " + sixDouble);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte oneByte = 67;
        System.out.println ("значение для типа byte равно " + oneByte);

        short twoShort1 = -159;
        System.out.println ("Первый вариант значения для типа short равен " + twoShort1);

        short twoShort2 = 569;
        System.out.println ("Второй вариант значения для типа short равен " + twoShort2);

        int threeInt = 27897;
        System.out.println ("значение для типа int равно " + threeInt);

        long fourLong = 987678965549L;
        System.out.println ("значение для типа long равно " + fourLong);

        float fiveFloat = 27.12f;
        System.out.println ("значение типа float равно "+ fiveFloat);

        double sixDouble = 2.786;
        System.out.println ("значение типа double равно " + sixDouble);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte ludmilaPavlovnasLearner =23;
        byte annaSergeevnasLearner =27;
        byte ekaterinaAndreevnasLearner =30;
        int allLearners = ludmilaPavlovnasLearner + annaSergeevnasLearner + ekaterinaAndreevnasLearner;
        short allPapers = 480;
        float papersForOne = (float) allPapers/allLearners;
        System.out.println ("На каждого ученика рассчитано " + papersForOne + " листов бумаги");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte performance = 16/2;

        byte minutesPerHour = 60;
        byte hourPerDay = 24;
        short daysPerMonth = 30;

        byte minutes = 20;
        byte days = 3;

        int minutesPerDay = minutesPerHour * hourPerDay;
        int minutesPer3Days = minutesPerDay * days;
        int minutesPerMonth = minutesPerHour * hourPerDay * daysPerMonth;

        int performancePer20Minutes = performance * minutes;
        System.out.println ("За 20 минут машина произвела " + performancePer20Minutes + " штук бутылок");

        int performancePerDay = performance * minutesPerDay;
        System.out.println ("За сутки машина произвела " + performancePerDay + " штук бутылок");

        int performancePer3Days = performance * minutesPer3Days;
        System.out.println ("За 3 суток машина произвела " + performancePer3Days + " штук бутылок");

        int performancePerMonth = performance * minutesPerMonth;
        System.out.println ("За месяц машина произвела " + performancePerMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte brown = 4;
        byte white = 2;
        byte allJars =120;
        int classes = allJars / (brown+ white);
        int whiteJars = white* classes;
        int brownJars = brown * classes;

        System.out.println ("В школе, где " + classes + " классов, нужно " + whiteJars + " банок белой краски и "+ brownJars + " банок коричневой краски");

    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightOneBanana = 80;

        short milk = 200;
        float weightOneMilk = (float) 105/100;

        short icecream = 2;
        byte weightOneIcecream = 100;

        byte eggs = 4;
        byte weightOneEgg = 70;

        double smoothieWeightG = bananas* weightOneBanana + milk* weightOneMilk + icecream* weightOneIcecream + eggs* weightOneEgg;

        double smoothieWeightKg = smoothieWeightG/1000;

        System.out.println ("Общий вес завтрака спортсмена " + smoothieWeightG + " грамм или " + smoothieWeightKg + " килограмм");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        short weightForDiet = 7*1000;
        short weightForFirstDietPlan = 250;
        short weightForSecondDietPlan = 500;
        int daysOfFirstDietPlan = weightForDiet/weightForFirstDietPlan;
        int daysOfSecondDietPlan = weightForDiet/weightForSecondDietPlan;
        int daysDietPlan = (daysOfFirstDietPlan + daysOfSecondDietPlan)/2;

        System.out.println ("Похудение спортсмена займет от " + daysOfSecondDietPlan + " до " + daysOfFirstDietPlan + " дней, что в среднем составит около " + daysDietPlan + " дней диеты" );

    }

    public static void task8 () {
        System.out.println("Задача 8");
        float promotion = 1.1f;

        int mashasMonthlySalary = 67760;
        int denisMonthlySalary = 83690;
        int kristinasMonthlySalary = 76230;

        float mashasMonthlySalaryPromotion = mashasMonthlySalary * promotion;
        float denisMonthlySalaryPromotion = denisMonthlySalary* promotion;
        float kristinasMonthlySalaryPromotion = kristinasMonthlySalary* promotion;

        int annualSalary = (mashasMonthlySalary+ denisMonthlySalary+ kristinasMonthlySalary)*12;

        float annualSalaryAfterPromotion = annualSalary* promotion;

        float annualPromotion = annualSalaryAfterPromotion - annualSalary;

        float mashasAnnualPromotion = (mashasMonthlySalaryPromotion-mashasMonthlySalary)*12;
        float kristinasAnnualPromotion = (kristinasMonthlySalaryPromotion-kristinasMonthlySalary)*12;
        float denisAnnualPromotion = (denisMonthlySalaryPromotion-denisMonthlySalary)*12;

        System.out.println ("Годовые расходы на зарплату компании выросли на " + annualPromotion + " рублей");

        System.out.println ("Маша теперь получает " + mashasMonthlySalaryPromotion + " рублей в месяц. Ее годовой доход вырос на " + mashasAnnualPromotion + " рублей" );

        System.out.println ("Денис теперь получает " + denisMonthlySalaryPromotion + " рублей в месяц. Его годовой доход вырос на " + denisAnnualPromotion + " рублей");

        System.out.println ("Кристина теперь получает " + kristinasMonthlySalaryPromotion + " рублей в месяц. Ее годовой доход вырос на " + kristinasAnnualPromotion + " рублей");

    }
}