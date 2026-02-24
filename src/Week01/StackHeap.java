package Week01;

public class StackHeap {
    public static void main(String[] args) {
        double hourlyRate = 54.0;
        int hoursWorked = 16;

        //double salary = calculateSal(hourlyRate, hoursWorked);

       // printSalary(salary);

        System.out.println(lastMark(5));;
    }
    public static double calculateSal(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    public static void printSalary(double sal){
        System.out.println("Salary: " + sal);
    }

    static float lastMark(int n) {
        float[] marks = new float[n];

        marks[0] = 75.5f;
        marks[n - 1] = 88.0f;

        return marks[n - 1];
    }
}
