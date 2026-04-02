package Week06_07.OPenClose.School;

import java.util.ArrayList;
import java.util.List;

public class Console {
    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();
        courses.add(new Course("CS", "A"));
      //  courses.add(new Course("CS", 50));
        GradingSystem gradingSystem = new LetterGradingSystem();
       // GradingSystem gradingSystem = new NumericGradingSystem();
        GPACalculator gpaCalculator = new GPACalculator(gradingSystem);
        System.out.println("GPA (Letter Grades): " + gpaCalculator.calculateGPA(courses));

    }
}
