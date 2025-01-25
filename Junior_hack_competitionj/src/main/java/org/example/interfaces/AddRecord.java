package org.example.interfaces;

import org.example.DTO.StudentDTO;
import org.example.databaseConnection.DatabaseConnection;
import org.example.operation.AddoperationStudent;

import java.sql.SQLException;
import java.util.Scanner;

public class AddRecord {
    public static int addStudentRecord(){
        Scanner input = new Scanner(System.in);
        System.out.println("Add a Student ....\n\n ");
        System.out.print("Add the name : ");
        String name = input.nextLine();
        System.out.print("\n");
        input.nextLine();

        System.out.print("Add student Id : ");
        String studentId = input.next();
        System.out.print("\n");
        input.nextLine();

        System.out.print("Add the age : ");
        int age = input.nextInt();
        System.out.print("\n");
        input.nextLine();

        System.out.print("Add the department : ");
        String department = input.next();
        System.out.print("\n");
        input.nextLine();

        AddoperationStudent addoperationStudent = new AddoperationStudent();
        DatabaseConnection databaseConnection = new DatabaseConnection();
        StudentDTO studentDTO = new StudentDTO(name, studentId, age, department);


        try {
            addoperationStudent.operation(databaseConnection.getConnection(),studentDTO);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return 1;
    }
}
