package Week02.Inheritance;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, String address, double hourlyRate) {
        super(name, address);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 10;
    }

    public void logHours(int hours) {
        this.hoursWorked += hours;
    }

    public double calculateWeeklyPay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String printDetails() {
        return "Role: Contract Employee, Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
