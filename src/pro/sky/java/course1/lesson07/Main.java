package pro.sky.java.course1.lesson07;

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

    }

    public static void task1() {
        System.out.println("Задача 1: Продолжите работать с кодом, который вы написали в предыдущем уроке — в задачах с накоплениями. С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей. Результат программы должен быть выведен в консоль с тем количеством месяцев, которое необходимо для накопления данной суммы. Формат сообщения: «Месяц …, сумма накоплений равна … рублей» .");

        double bank = 0;
        double salary = 15000;
        int month = 0;
        double goal = 2_459_000;

        while (bank <= goal) {
            bank = bank + salary;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + bank + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2: Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while. На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for. Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою. Не забудьте выполнить переход на новую строку между двумя циклами.");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }

        System.out.println();

        i--;

        while (i > 0) {
            System.out.print(i + "\t");
            i--;
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3:  В стране Y население равно 12 миллионов человек. Рождаемость составляет 17 человек на 1000, смертность — 8 человек. Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны. В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».");

        int people = 12_000_000;
        int fertilityPerThousand = 17;
        int deathPerThousand = 8;
        int startYear = 2022;

        for (int i = 1; i <= 10; i++) {
            people = people + (people / 1000 * fertilityPerThousand) - (people / 1000 * deathPerThousand);
            System.out.println("В " + (startYear + i) + " году, численность населения составляет " + people);
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4:  Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей. Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%. Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.");

        float bank = 15000f;
        int percent = 7;
        float interest = 0f;
        int month = 0;
        int goal = 12000000;

        while (bank <= goal) {
            interest = Math.round(bank * percent);
            bank = bank + interest / 100;
            month++;
            System.out.println("К " + month + " месяцу, сумма накоплений равна " + bank + " рублей");
        }

        System.out.println("Всего " + month + " месяцев понадобится Василию, чтобы накопить " + bank + " рублей");
        System.out.println();

    }

    public static void task5() {
        System.out.println("Задача 5:  Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей. Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%. Выведите в консоль не все месяцы подряд, а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.");

        float bank = 15000f;
        int percent = 7;
        float interest = 0f;
        int month = 0;
        int goal = 12000000;

        while (bank <= goal) {
            interest = Math.round(bank * percent);
            bank = bank + interest / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("К " + month + " месяцу, сумма накоплений равна " + bank + " рублей");
            }
        }

        System.out.println("Всего " + month + " месяцев понадобится Василию, чтобы накопить " + bank + " рублей");
        System.out.println();

    }

    public static void task6() {
        System.out.println("Задача 6: Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет. Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.");

        float bank = 15000f;
        int percent = 7;
        float interest = 0f;
        int month = 0;
        int monthFinish = 9 * 12;

        while (month <= monthFinish) {
            interest = Math.round(bank * percent);
            bank = bank + interest / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("К " + month + " месяцу, сумма накоплений равна " + bank + " рублей");
            }
        }

        System.out.println("Всего за 9 лет Василию удастся накопить " + bank + " рублей");
        System.out.println();

    }

    public static void task7() {
        System.out.println("Задача 7: В компании пятница — отчетный день. Нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет. Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7). Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида: «Сегодня пятница, ...-е число. Необходимо подготовить отчет». В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.");

        int month = 31;
        for (int firstFriday = 2; firstFriday <= month; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }


    public static void task8() {
        System.out.println("Задача 8: Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета. Известно, что комета пролетает каждый 79-й год, начиная с нулевого. В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет). Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.");

        int periodComet = 79;
        int currentYear = 2022;
        int cometObsevationPeriodStart = currentYear - 200;
        int cometObsevationPeriodFinish = currentYear + 100;

        for (int firstCometYear = 0; firstCometYear <= cometObsevationPeriodFinish; firstCometYear = firstCometYear + periodComet) {
            if (firstCometYear >= cometObsevationPeriodStart) {
                System.out.println(firstCometYear);
            }
        }
    }
}