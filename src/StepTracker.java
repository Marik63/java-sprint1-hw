import java.util.HashMap;

public class StepTracker { //Задача класса - получить кол-во шагов, которые нужно записать, а также отдавать кол-во шагов за опред. день
    int aimToSteps = 10000;
    HashMap<Integer, MonthData> monthToData = new HashMap<>();

    public StepTracker() {
        for (int i = 1; i <= 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    void saveStepMonth(int month, int day, int steps) {
        MonthData monthData = monthToData.get(month); //Здесь получаю месяц из мапа monthToData
        monthData.updateSteps(day, steps);
        System.out.println(day + " день: " + steps);
        // Количество шагов можно записать как: month.getSteps(day)
    }

    int sumStepsManth(int month) { //Считаю общее количество шагов
        int sum = 0;
        for (int i = 0; i <= 30; i++) {
            sum += monthToData.get(month).dayToSteps.get(i);
        }
        return sum;
    }

    int maxStepsManth(int month) { //Ищу самое большое количество шагов
        int sum = 0; //Создаю переменную
        for (int i = 0; i <= 30; i++) {
            if (sum < monthToData.get(month).dayToSteps.get(i)) {
                sum = monthToData.get(month).dayToSteps.get(i);
            }
        }
        return sum;
    }

    void midleStepsManth(int month) { // Ищу среднее значение шагов

        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            sum += monthToData.get(month).dayToSteps.get(i);
        }
        System.out.println("Среднее кол-во шагов в месяц " + sum / monthToData.size());
    }


    void bestToSteps(int month) { //Считаю лучшую серию
        int max = 0; //Переменная максимальной серии
        int j = 0;   // Переменная для текущей серии
        for (int i = 0; i <= 30; i++) {
            if (monthToData.get(month).dayToSteps.get(i) > aimToSteps) {
                j++;

            } else {
                if (j > max) {
                    max = j;
                }
                j = 0;
            }
        }
        System.out.println("Лучшая серия: " + max);
    }

    void changeAimToSteps(int aim) {
        if (aim <= 0) {
            System.out.println("Цель по количеству шагов не может быть отрицательной.");
        } else {
            System.out.println("Ваша цель изменена с " + aimToSteps +" шагов на " + aim);
        }
    }
}

