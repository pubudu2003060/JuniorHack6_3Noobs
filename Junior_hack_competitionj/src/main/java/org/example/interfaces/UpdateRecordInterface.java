package org.example.interfaces;

import java.util.Scanner;

public class UpdateRecordInterface {

    public static int createUpdateRecordInterface(){
        System.out.println("Update Student...\n\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Student ID(eg: abc0001): ");
        int id = input.nextInt();


        System.out.println("Enter the Attribute to update[1 - name , 2 - age ,3 - department]: ");
        int attribute = input.nextInt();
        input.nextLine();
        System.out.println("new Value: ");
        int value = input.nextInt();
        input.nextLine();

        return 1;
    }
}
