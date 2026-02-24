package Week01;

public class Marks {
    public static void main(String[] args) {
        double mark = 63;
        String grade;

        if (mark >= 83.00 && mark <= 100.00) {
            grade = "High Distinction";
        } else if (mark >= 73.00) {
            grade = "Distinction";
        } else if (mark >= 63.00) {
            grade = "Credit";
        } else if (mark >= 50.00) {
            grade = "Pass";
        } else if (mark >= 0.00) {
            grade = "Fail";
        } else {
            grade = "Invalid mark";
        }

        System.out.println("Grade: " + grade);
    }
}
