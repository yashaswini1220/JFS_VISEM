package com.skillnext;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            EmployeeDAO dao = new EmployeeDAO();

            // Add employee
            Employee e1 = new Employee("John Doe", "john@example.com", 50000);
            dao.addEmployee(e1);
			Employee e2 = new Employee("John Doe", "john@example.com", 50000);
            dao.addEmployee(e2);
            System.out.println("Employee Added Successfully!");
            Employee e3 = new Employee("John Doe", "john@example.com", 50000);
            dao.addEmployee(e3);
            // Fetch employees
            List<Employee> employees = dao.getAllEmployees();
            for (Employee e : employees) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
