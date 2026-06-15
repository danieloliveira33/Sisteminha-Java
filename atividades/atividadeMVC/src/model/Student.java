package model;

import java.util.ArrayList;
import java.util.List;

// Student herda de Person
public class Student extends Person {
    private String enrollmentNumber;
    private Course course;

    public Student() {}

    public String getEnrollmentNumber() { return enrollmentNumber; }
    public void setEnrollmentNumber(String enrollmentNumber) { this.enrollmentNumber = enrollmentNumber; }
    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    @Override
    public String toString() {
        return "Student [" + getEnrollmentNumber() + "] " + getName() + " (Age: " + getAge() + ") - Course: " +
                (course != null ? course.getName() : "None");
    }
}

