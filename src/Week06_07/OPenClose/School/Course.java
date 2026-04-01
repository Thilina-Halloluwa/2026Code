package Week06_07.OPenClose.School;

public class Course {
    private String name;
    private String letterGrade;
    private double numericGrade;

    // Constructor for letter grades
    public Course(String name, String letterGrade) {
        this.name = name;
        this.letterGrade = letterGrade;
    }

    // Constructor for numeric grades
    public Course(String name, double numericGrade) {
        this.name = name;
        this.numericGrade = numericGrade;
    }

    public String getName() {
        return name;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public double getNumericGrade() {
        return numericGrade;
    }
}