import java.util.HashMap;

public class MonthData {
    HashMap<Integer, Integer> dayToSteps = new HashMap<>(); //Хранит шаги за каждый день месяца

    public MonthData() {
        for (int i = 0; i <= 30; i++) {
            dayToSteps.put(i, 0);
        }
    }

    public void updateSteps(int day, int steps) { //Получаю шаги за определенный день из StepTracker
        dayToSteps.put(day, steps);
    }

    public int getSteps(int day) {
        return dayToSteps.get(day);
    }
}
