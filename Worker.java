
public class Worker extends Person {
    double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            return regularPay + overtimePay;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        double totalPay = regularPay + overtimePay;

        return "Regular Pay (40 hours): $" + regularPay
                + "\nOvertime Pay (" + overtimeHours + " hours): $" + overtimePay
                + "\nTotal Weekly Pay: $" + totalPay;
    }
}