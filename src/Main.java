public class Main {
    public static void main(String[] args) {

        //Задача 1

        int totalExpenses = 0; //суммарное значение трат за месяц
        int[] expenses = {501, 7200, 900, 1800, 2000};
        for (int i : expenses) {  // можно через обычный for (int i = 0; i < expenses.length; i++), но я захотел попробовать for each
            totalExpenses = totalExpenses + i; //тут ждал подвох, если сделать+ expenses[i], то не работает, как оказалось, внутри for each переменная i принимает значения ячейки
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");

        //Задача 2

        int minExpenses = expenses[0]; //переменным минимального и максимального значения присвоено значение первой траты, для дальнейшего сравнения
        int maxExpenses = expenses[0];
        for (int i : expenses) {
            if (minExpenses > i) {
                minExpenses = i;
            }
            if (maxExpenses < i) {
                maxExpenses = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");

        //Задача 3
        //из 1 задачи нам известна сумма, которую остается только поделить на количество недель, в нашем массиве 5, но можно использовать и .lenght
        double averageExpenses = (double) totalExpenses / expenses.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");

        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i > -1; i--) {//присваиваем самое большое значение длины, и поскольку отсчет с 0, то ставим -1 в значение и в условие.
            System.out.print(reverseFullName[i]);
        }

    }


}

