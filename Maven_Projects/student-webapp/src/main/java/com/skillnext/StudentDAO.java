package com.skillnext;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/skillnext_db?useSSL=false&serverTimezone=UTC";
    private String jdbcUsername = "root";  // replace with your MySQL username
    private String jdbcPassword = "password";  // replace with your MySQL password

    private static final String SELECT_ALL = "SELECT * FROM students";
    private static final String INSERT_STUDENT = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";

    // Get database connection
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // optional in modern JDBC
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Get all students
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_ALL);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String course = rs.getString("course");

                students.add(new Student(id, name, email, course));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    // Insert a new student
    public void insertStudent(Student student) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_STUDENT)) {

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getCourse());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
