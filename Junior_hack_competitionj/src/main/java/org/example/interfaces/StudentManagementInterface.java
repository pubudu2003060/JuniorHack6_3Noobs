package org.example.interfaces;

import java.util.Scanner;

public class StudentManagementInterface {
    public int createStudentManagement(){
        Scanner Option = new Scanner(System.in);

        System.out.println("Student management...\n\n");
        System.out.println("[1] Add student \n");
        System.out.println("[2] Remove Students\n");
        System.out.println("[3] Update Student\n");
        System.out.println("[4] View Student Details\n");
        System.out.println("[0] Main Menu\n");

        int optionStudentManagemt = Option.nextInt();

        return optionStudentManagemt;
    }
}
