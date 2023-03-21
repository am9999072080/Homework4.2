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
        System.out.println("Задача-1");
        int total = 0;
        int salary = 15_000;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача-2");
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача-3");
        int population = 12_000_000;
        int deathsOfThePopulation = population / 1_000 * 8;
        int birthOfPopulation = population / 1_000 * 17;
        int year = 1;
        for (; year <= 10; year++) {
            population = population + birthOfPopulation - deathsOfThePopulation;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача-4");
        int totalAmount = 15000;
        for (int month = 1; totalAmount <= 12_000_000; month++) {
            totalAmount = totalAmount + totalAmount * 7 / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalAmount + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача-5");
        int totalAmount = 15000;
        for (int month = 1; totalAmount <= 12_000_000; month++) {
            totalAmount = totalAmount + totalAmount * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalAmount + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача-6");
        int totalAmount = 15000;
        for (int i = 1; ; i++) {
            totalAmount = totalAmount + totalAmount * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalAmount + " рублей");
            }
            if (i == 9 * 12) {
                break;
            }
        }
    }

    public static void task7() {
        System.out.println("Задача-7");
        int mothDays = 31;
        for (int i = 2; i <= mothDays; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача-8");
        int theLast200Years = 2023 - 200;
        int forTheNext100Years = 2023 + 100;
        for (int i = 0; i <= forTheNext100Years; i = i + 79) {
            if (i >= theLast200Years) {
                System.out.println(i);
            }
        }
    }
}