# Student Management System using Java JDBC

## About the Project
The Student Management System is a console-based Java application developed to manage student records using JDBC (Java Database Connectivity) and MySQL.

It allows users to perform basic database operations efficiently through a menu-driven interface.

## Technologies Used
- Java
- JDBC
- MySQL
- Maven
- IntelliJ IDEA
- MySQL Workbench

## Project Structure
```text
StudentManagementJDBC/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── student/
│                   ├── DBConnection.java
│                   ├── Main.java
│                   ├── Student.java
│                   └── StudentDAO.java
│
├── pom.xml
├── .gitignore
└── README.md
```

## Features
- Add new student records
- View student details
- Update existing student information
- Delete student records
- Store and retrieve student data using MySQL

## Database Configuration

1. Open MySQL Workbench.
2. Create a database named `student_db`.
3. Create the required `students` table according to the application schema.
4. Configure your database connection in `DBConnection.java`.

**Note:** Keep database credentials private. Use environment variables instead of committing actual passwords.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Rinsharino6b6/Student-Management-System-JDBC.git
   ```

2. Open the project in IntelliJ IDEA.

3. Configure the MySQL database connection.

4. Allow Maven to download the required dependencies.

5. Run `Main.java`.

## Concepts Implemented
- JDBC connectivity
- CRUD operations
- PreparedStatement
- ResultSet
- DAO (Data Access Object) pattern
- Exception handling
- Maven dependency management

## Author
**Rinsha K. A**

Student Management System – Java JDBC Project
