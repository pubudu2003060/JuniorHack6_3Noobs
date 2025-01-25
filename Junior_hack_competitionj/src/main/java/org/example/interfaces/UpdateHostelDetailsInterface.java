package org.example.interfaces;

import java.util.Scanner;

public class UpdateHostelDetailsInterface {
    public static int createUpdateHostelDetailsInterface() {
        System.out.println("Update hostel details....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hostel ID: ");
        String hostelID = sc.nextLine();

        System.out.println("Enter the Attribute to update[1 - name , 2 - number of rooms:");
        int attribute = sc.nextInt();
        System.out.println("new Value: ");
        int value = sc.nextInt();

        return 1;


    }
}
