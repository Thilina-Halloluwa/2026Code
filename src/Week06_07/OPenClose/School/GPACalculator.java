package Week06_07.OPenClose.School;

import java.util.List;

public class GPACalculator {

    private GradingSystem gradingSystem;

    public GPACalculator(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    public double calculateGPA(List<Course> courses) {
        double totalPoints = 0;
        for (Course course : courses) {
            totalPoints += gradingSystem.getGradePoints(course);
        }
        return totalPoints / courses.size();
    }
}

