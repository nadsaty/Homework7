public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1 \n Подсчет накоплений: ");
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
        System.out.println("Задача 2 \n Числа по порядку и обратно: ");

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
}
