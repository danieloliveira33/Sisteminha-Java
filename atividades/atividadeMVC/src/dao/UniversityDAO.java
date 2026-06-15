package dao;

import model.Course;
import model.Subject;
import util.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UniversityDAO {
    public void displayStructure() {
        String sql = "SELECT c.name AS course_name, s.name AS subject_name " +
                "FROM course c " +
                "LEFT JOIN subject s ON c.id = s.course_id " +
                "ORDER BY c.name";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n--- HOGWARTS ACADEMIC STRUCTURE ---");
            String currentCourse = "";

            while (rs.next()) {
                String courseName = rs.getString("course_name");
                if (!courseName.equals(currentCourse)) {
                    System.out.println("\nCourse: " + courseName);
                    currentCourse = courseName;
                }
                System.out.println("  - Subject: " + rs.getString("subject_name"));
            }
        } catch (SQLException e) {
            System.out.println("Error fetching structure: " + e.getMessage());
        }
    }
}