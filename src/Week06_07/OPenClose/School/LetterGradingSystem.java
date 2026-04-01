package Week06_07.OPenClose.School;

public class LetterGradingSystem implements GradingSystem {
    @Override
    public double getGradePoints(Course course) {
        String grade = course.getLetterGrade();

        switch (grade) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            default: throw new IllegalArgumentException("Invalid grade");
        }

    }
}
