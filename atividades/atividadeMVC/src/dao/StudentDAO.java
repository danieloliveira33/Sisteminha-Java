package dao;

import model.Student;
import model.Course;
import model.Subject;
import util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void insert(Student student) {
        String insertPersonSQL = "INSERT INTO person (name, age) VALUES (?, ?) RETURNING id";
        String insertStudentSQL = "INSERT INTO student (person_id, enrollment_number, course_id) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false);

            int newPersonId = -1;
            try (PreparedStatement pstmt = conn.prepareStatement(insertPersonSQL)) {
                pstmt.setString(1, student.getName());
                pstmt.setInt(2, student.getAge());
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    newPersonId = rs.getInt(1);
                    student.setId(newPersonId);
                }
            }

            if (newPersonId != -1) {
                try (PreparedStatement pstmt2 = conn.prepareStatement(insertStudentSQL)) {
                    pstmt2.setInt(1, newPersonId);
                    pstmt2.setString(2, student.getEnrollmentNumber());
                    pstmt2.setInt(3, student.getCourse().getId());
                    pstmt2.executeUpdate();
                }
            }

            conn.commit();
            System.out.println("Student successfully registered at Hogwarts!");

        } catch (SQLException e) {
            System.out.println("Error during insertion: " + e.getMessage());
        }
    }

    public List<Student> listAll() {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT p.id, p.name, p.age, s.enrollment_number, c.id AS course_id, c.name AS course_name " +
                "FROM student s " +
                "JOIN person p ON s.person_id = p.id " +
                "JOIN course c ON s.course_id = c.id";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setEnrollmentNumber(rs.getString("enrollment_number"));

                Course course = new Course(rs.getInt("course_id"), rs.getString("course_name"));
                fetchSubjectsForCourse(course, conn);

                student.setCourse(course);
                list.add(student);
            }
        } catch (SQLException e) {
            System.out.println("Error listing students: " + e.getMessage());
        }
        return list;
    }

    private void fetchSubjectsForCourse(Course course, Connection conn) throws SQLException {
        String sql = "SELECT name FROM subject WHERE course_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, course.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    course.addSubject(new Subject(0, rs.getString("name")));
                }
            }
        }
    }

    public void update(Student student) {
        String sql = "UPDATE person SET name = ?, age = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            stmt.setInt(3, student.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    public void delete(int personId) {
        String sql = "DELETE FROM person WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, personId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}