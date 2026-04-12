package Week06_07.DI.Intro;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Course> courses = new ArrayList<>();
       // LinkedList<Course> courses = new LinkedList<>();
       // List<Course> courses = new LinkedList<>();

        courses.add(new Course("CSSE2002", 6.0));
        courses.add(new Course("CSSE1001", 5.0));

        Student student = new Student(courses);

        double totalGradePoints = student.calculateTotalGradePoints();

        System.out.println("Total grade points: " + totalGradePoints);
    }
}

class Student {

    private ArrayList<Course> courses;

    public Student(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public double calculateTotalGradePoints() {
        double totalGradePoints = 0;

        for (Course course : courses) {
            totalGradePoints += course.getGradePoints();
        }

        return totalGradePoints;
    }
}


class Course {
    private String courseCode;
    private double gradePoints;

    public Course(String courseCode, double gradePoints) {
        this.courseCode = courseCode;
        this.gradePoints = gradePoints;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public double getGradePoints() {
        return gradePoints;
    }
}