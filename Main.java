import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();


        printMenu();
        int userInput = scanner.nextInt();
        while (userInput != 0) {
            if (userInput == 1) {
                printMonth();
                System.out.println("Введите месяц от 1 до 12.");
                int month = scanner.nextInt();
                if (month > 12 || month < 0) {
                    System.out.println("Вы не верно ввели месяц");
                    break;
                }
                System.out.println("Введите день от 1 до 30.");
                int day = scanner.nextInt();
                if (day > 30 || day < 0) {
                    System.out.println("Не верно ввели день");
                    break;
                }
                System.out.println("Введите количество шагов.");
                int step = scanner.nextInt();
                stepTracker.saveStepMonth(month, day, step);

            } else if (userInput == 2) {
                System.out.println("Введите номер месяца");
                int month = scanner.nextInt();
                if (month > 12 || month < 0) {
                    System.out.println("Не верно ввели месяц");
                    break;
                }
                stepTracker.statisticStepsManth(month);

            } else if (userInput == 3) {
                System.out.println("Введите новую цель:");
                int aim = scanner.nextInt();
                stepTracker.changeAimToSteps(aim);

            } else if (userInput == 0) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Ошибка");
            }
            printMenu();
            userInput = scanner.nextInt();
        }
    }

    private static void printMenu () {
        System.out.println("Выберите команду:");
        System.out.println("1 – Ввести количество шагов за день.");
        System.out.println("2 - Напечатать статистику за определённый месяц.");
        System.out.println("3 - Изменить цель по количеству шагов.");
        System.out.println("0 – Выйти из приложения.");
    }

    public static void printMonth() {
        System.out.println("Выберите месяц:\n" +
                "1 - Январь\n" +
                "2 - Февраль\n" +
                "3 - Март\n" +
                "4 - Апрель\n" +
                "5 - Май\n" +
                "6 - Июнь\n" +
                "7 - Июль\n" +
                "8 - Август\n" +
                "9 - Сентябрь\n" +
                "10 - Октябрь\n" +
                "11 - Ноябрь\n" +
                "12 - Декабрь\n");
    }
}