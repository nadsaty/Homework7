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
        System.out.println("\n Задача 1 \n Подсчет накоплений: ");
        int cashSaving = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            total = total + cashSaving;
            i = i + 1;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + total);
        }
        System.out.println(i + " месяцев ушло на накопление нужной суммы \n");
    }

    public static void task2() {
        System.out.println("\n Задача 2 \n Числа по порядку и обратно: ");

        int num = 0;
        while (num < 10) {
            num = num + 1;
            System.out.print(num + " ");
        }
        System.out.println(" ");

        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("\n \n Задача 3 \n Подсчет текущей популяции: ");
        int totalPopulation = 12000000;
        int newPeople = 17;
        int deadPeople = 8;
        int newPopulation = (totalPopulation / 1000) * (newPeople - deadPeople);
        for (int i = 1; i <= 10; i = i + 1) {
            totalPopulation = totalPopulation + newPopulation;
            System.out.println("Год " + i + " численность населения составляет " + totalPopulation);
        }
    }

    public static void task4() {
        System.out.println("\n \n Задача 4 \n Подсчет накоплений: ");
        int firstDeposit = 15000;
        int cashSaving = 0;
        int i = 0;
        while (cashSaving < 12000000) {
            cashSaving = cashSaving + firstDeposit;
            cashSaving = cashSaving + ((firstDeposit / 100) * 7);
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + cashSaving + " рублей");
        }
        System.out.println(i + " месяцев ушло на то, чтобы собрать сумму в 12 000 000р");
    }

    public static void task5() {
        System.out.println("\n \n Задача 5 \n Подсчет накоплений за каждый шестой месяц: ");
        int firstDeposit = 15000;
        int cashSaving = 0;
        int i = 0;
        while (cashSaving < 12000000) {
            cashSaving = cashSaving + firstDeposit;
            cashSaving = cashSaving + ((firstDeposit / 100) * 7);
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + cashSaving + " рублей");
            }
        }
        System.out.println(i + " месяцев ушло на то, чтобы собрать сумму в 12 000 000р");
    }

    public static void task6() {
        System.out.println("\n \n Задача 6 \n Подсчет накоплений за каждые полгода: ");
        int firstDeposit = 15000;
        int cashSaving = 0;
        int i = 0;
        while (i < 108) {
            cashSaving = cashSaving + firstDeposit;
            cashSaving = cashSaving + ((firstDeposit / 100) * 7);
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + cashSaving + " рублей");
            }
        }
        System.out.println("Сумма накоплений за 9 лет составила - " + cashSaving);
    }
    public static void task7() {
        System.out.println("\n \n Задача 7 \n Пятничные отчеты: ");
        int firstFriday= 7;
        for (int i = 1; i <= 31; i = i + 1) {
            if (i % firstFriday != 0) {
                System.out.println(i);
            }
            if (i % firstFriday == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println("\n \n Задача 8 \n Полет кометы: ");
        int begin = 1896;
        int end = 2054;
        for (int i = 0; i <= end; i = i + 1) {
            if (i % 79 == 0  && i >= begin) {
                System.out.println(i);
            }
        }
    }
}
