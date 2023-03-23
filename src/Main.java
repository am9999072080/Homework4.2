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
        int month = 0;
        int totalAmount = 2_459_000;
        while (total <= totalAmount) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
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
        int year = 1;
        for (; year <= 10; year++) {
            int birthOfPopulation = population / 1_000 * 9;
            population = population + birthOfPopulation;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача-4");
        double totalAmount = 15_000;
        int finalAmount = 12_000_000;
        double per = 0.07;
        for (int month = 1; totalAmount <= finalAmount; month++) {
            totalAmount = totalAmount + totalAmount * per;
            String result = String.format("%.2f", totalAmount);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + result + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача-5");
        double totalAmount = 15_000;
        int finalAmount = 12_000_000;
        double per = 0.07;
        for (int month = 1; totalAmount <= finalAmount; month++) {
            totalAmount = totalAmount + totalAmount * per;
            if (month % 6 == 0) {
                String result = String.format("%.2f", totalAmount);
                System.out.println("Месяц " + month + ", сумма накоплений равна " + result + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача-6");
        double totalAmount = 15_000;
        double per = 0.07;
        for (int i = 1; ; i++) {
            totalAmount = totalAmount + totalAmount * per;
            if (i % 6 == 0) {
                String result = String.format("%.2f", totalAmount);
                System.out.println("Месяц " + i + ", сумма накоплений равна " + result + " рублей");
            }
            if (i == 9 * 12) {
                break;
            }
        }
    }

    public static void task7() {
        System.out.println("Задача-7");
        int monthDays = 31;
        for (int i = 2; i <= monthDays; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача-8");
        int theLast200Years = 2_023 - 200;
        int forTheNext100Years = 2_023 + 100;
        int cometIsPassing = 79;
        for (int year = 0; year <= forTheNext100Years; year = year + cometIsPassing) {
            if (year >= theLast200Years) {
                System.out.println(year);
            }
        }
    }
}