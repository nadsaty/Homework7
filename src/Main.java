public class Main {
    public static void main(String[] args) {
        task1();
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
        System.out.println(i + " месяцев ушло на накопление нужной суммы");
    }
}
