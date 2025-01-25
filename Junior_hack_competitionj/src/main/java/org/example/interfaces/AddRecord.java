package org.example.interfaces;

import java.util.Scanner;

public class AddRecord {
    public int addStudentRecord(){
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

        return 1;
    }
}
