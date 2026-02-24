package Week01;

public class Marks {
    public static void main(String[] args) {
        double mark = 63;
        String grade;

        if (mark < 0.0 || mark > 100.0) {
            grade = "Invalid mark";
        } else if (mark >= 83.0) {
            grade = "High Distinction";
        } else if (mark >= 73.0) {
            grade = "Distinction";
        } else if (mark >= 63.0) {
            grade = "Credit";
        } else if (mark >= 50.0) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
    }
}
