public class Main {
    public static void main(String[] args) {

        //Задача 1

        int totalExpenses = 0; //суммарное значение трат за месяц
        int[] expenses = {500, 7200, 900, 1800, 2000};
        for (int i : expenses) {  // можно через обычный for (int i = 0; i < expenses.length; i++), но я захотел попробовать for each
            totalExpenses = totalExpenses + i; //тут ждал подвох, если сделать+ expenses[i], то не работает, как оказалось, внутри for each переменная i принимает значения ячейки
        }
        System.out.println("«Сумма трат за месяц составила " + totalExpenses + " рублей».");

        //Задача 2

        int minExpenses=0;
        int maxExpenses=0;

    }
}
