package com.skillnext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Insert a new student (test)
        Student s1 = new Student();
        s1.setName("John Doe");
        s1.setEmail("john@example.com");
        s1.setCourse("Computer Science");
        dao.insertStudent(s1);
        System.out.println("Student inserted successfully.");

        // Retrieve all students
        List<Student> students = dao.getAllStudents();
        for (Student s : students) {
            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " | " + s.getCourse());
        }
    }
}
