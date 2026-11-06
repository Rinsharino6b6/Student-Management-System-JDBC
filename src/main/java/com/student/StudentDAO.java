package com.student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class StudentDAO {
    public void addStudent(Student student) {

        String sql = "INSERT INTO students (name, age, department, email) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getDepartment());
            ps.setString(4, student.getEmail());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Added Successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Error Adding Student!");
            e.printStackTrace();
        }
    }

    public void viewAllStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             java.sql.ResultSet rs = ps.executeQuery()) {

            System.out.println("\n------ STUDENT DETAILS ------");

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Email: " + rs.getString("email"));

                System.out.println("-----------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Error Fetching Students!");
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name, int age,
                              String department, String email) {

        String sql = "UPDATE students SET name = ?, age = ?, department = ?, email = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, department);
            ps.setString(4, email);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Updated Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

        } catch (SQLException e) {
            System.out.println("Error Updating Student!");
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {

        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Deleted Successfully!");
            } else {
                System.out.println("Student ID Not Found!");
            }

        } catch (SQLException e) {
            System.out.println("Error Deleting Student!");
            e.printStackTrace();
        }
    }


}
