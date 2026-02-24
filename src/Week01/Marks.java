package Week01;

public class Marks {
    public static void main(String[] args) {
        double mark = 78.5;
        String grade;

        if (mark >= 83.00 && mark <= 100.00) {
            grade = "High Distinction";
        } else if (mark >= 73.00 && mark <= 82.99) {
            grade = "Distinction";
        } else if (mark >= 63.00 && mark <= 72.99) {
            grade = "Credit";
        } else if (mark >= 50.00 && mark <= 62.99) {
            grade = "Pass";
        } else if (mark >= 0.00 && mark <= 49.99) {
            grade = "Fail";
        } else {
            grade = "Invalid mark";
        }

        System.out.println("Grade: " + grade);
    }
}
