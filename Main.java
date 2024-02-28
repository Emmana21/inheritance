
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Worker instances
        workers.add(new Worker("001", "Lanny", "Owens", "Ms.", 1982,25.0));
        workers.add(new Worker("002", "Duncan", "Butler", "Mr.", 1979, 30.0));
        workers.add(new Worker("003", "Carrol", "Pollard", "Mrs.", 1973, 28.0));

        // SalaryWorker instances
        workers.add(new SalaryWorker("004", "Marcy", "Johnson", "Ms.", 1972, 0.0, 60000.0));
        workers.add(new SalaryWorker("005", "Taylor", "Johns", "Ms.", 1988, 0.0, 80000.0));
        workers.add(new SalaryWorker("006", "Ron", "Donovan", "Mr.", 1973, 0.0, 70000.0));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.println("Week " + (week + 1) + " (Hours Worked: " + weeklyHours[week] + ")");
            System.out.println("=====================================");
            System.out.printf("%-10s %-15s %-15s %n", "ID", "Name", "Weekly Pay");
            System.out.println("=====================================");
            for (Worker worker : workers) {
                String name = worker.getFirstName() + " " + worker.getLastName();
                double weeklyPay = worker.calculateWeeklyPay(weeklyHours[week]);
                System.out.printf("%-10s %-15s $%-15.2f %n", worker.getID(), name, weeklyPay);
            }
            System.out.println();
        }
    }
}