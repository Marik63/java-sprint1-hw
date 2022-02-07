import java.util.HashMap;

public class StepTracker {
    int aimToSteps = 10000;
    Converter converter = new Converter(75, 50);
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
        // Количество шагов можно записать как: month.getSteps(day);
    }

    void statisticStepsManth(int month) {
        int sum = 0;
        int max = 0;
        int j = 0;   // Переменная для текущей серии
        for (int i = 1; i <= 30; i++) {
            sum += monthToData.get(month).getSteps(i);
            if (max < monthToData.get(month).getSteps(i)) {
                max = monthToData.get(month).getSteps(i);
                }
            }
            System.out.println("Общее количество шагов в месяце - " + sum + " шагов.");
            System.out.println("Максимальное пройденное количество шагов в месяце - " + max);
            System.out.println("Среднее кол-во шагов в месяц " + sum / 30);


            int steps = sum;
            System.out.println("Пройденная дистанция (в км) " + converter.distance(steps));
            System.out.println("Количество сожжённых килокалорий - " + converter.caloris(steps));



            for (int i = 1; i <= 30; i++) {
                if (monthToData.get(month).getSteps(i) > aimToSteps) {
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

        void changeAimToSteps( int aim){
            if (aim <= 0) {
                System.out.println("Цель по количеству шагов не может быть отрицательной.");
            } else {
                System.out.println("Ваша цель изменена с " + aimToSteps + " шагов на " + aim);
        }
    }
}
