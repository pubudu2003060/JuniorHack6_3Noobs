package org.example.interfaces;

import java.util.Scanner;

public class StudentManagementInterface {
    public int createStudentManagement(){
        Scanner Option = new Scanner(System.in);

        System.out.println("Student management...");
        System.out.println("[1] Add student");
        System.out.println("[2] Remove Students");
        System.out.println("[3] Update Student");
        System.out.println("[4] View Student Details");
        System.out.println("[0] Main Menu");

        int optionStudentManagemt = Option.nextInt();

        return optionStudentManagemt;
    }
}
