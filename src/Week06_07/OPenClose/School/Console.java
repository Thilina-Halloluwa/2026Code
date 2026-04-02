package Week06_07.OPenClose.School;

import java.util.ArrayList;
import java.util.List;

public class Console {
    public static void main(String[] args) {
        List<Course> letterGradeCourses = new ArrayList<>();
        List<Course> numberGradeCourses = new ArrayList<>();

        letterGradeCourses.add(new Course("CS", "A"));

        GradingSystem gradingSystem = new LetterGradingSystem();
        GPACalculator gpaCalculator = new GPACalculator(gradingSystem);

        System.out.println("GPA (Letter Grades): " + gpaCalculator.calculateGPA(letterGradeCourses));


        numberGradeCourses.add(new Course("CS", 50));

        gradingSystem = new NumericGradingSystem();
        gpaCalculator = new GPACalculator(gradingSystem);

        System.out.println("GPA (Number Grades): " + gpaCalculator.calculateGPA(numberGradeCourses));
    }
}
