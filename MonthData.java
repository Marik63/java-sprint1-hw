public class MonthData {

    int[] daysOfMonth = new int[30];

    public MonthData() {
        for (int i = 1; i < daysOfMonth.length; i++) {
            daysOfMonth[i] = 0;
        }
    }

    public void updateSteps(int day, int steps) {
        daysOfMonth[day-1] = steps;
    }

    public int getSteps(int day) {
        return daysOfMonth[day-1];
    }
}
