package org.example.interfaces;

import java.util.Scanner;

public class StudentAllocationManagentInterface {
    public int createStudentAllocationManagemntInterface(){



            Scanner input = new Scanner(System.in);

            System.out.println("Student Allocation Management.....\n\n");
            System.out.println("[1] Allocate room to a student\n");
            System.out.println("[2] Delete an allocation\n");
            System.out.println("[3] View an allocation\n");
            System.out.println("[0] main menu\n");

            int optionHostelManagement = input.nextInt();
            return optionHostelManagement;

    }
}
