package Week06_07.OPenClose.School;

public class NumericGradingSystem implements GradingSystem {
    @Override
    public double getGradePoints(Course course) {
        double score = course.getNumericGrade();

        if (score >= 85) return 4.0;
        else if (score >= 75) return 3.0;
        else if (score >= 65) return 2.0;
        else if (score >= 50) return 1.0;
        else return 0.0;
    }
}
