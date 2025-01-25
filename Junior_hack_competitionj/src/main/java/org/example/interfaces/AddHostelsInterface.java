package org.example.interfaces;

import org.example.databaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.util.Scanner;

public class AddHostelsInterface {
    public static int createAddHostelDetailsInterface() {
        System.out.println("Add A Hostl....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hostel Name: ");
        String hostelName = sc.nextLine();
        System.out.println("Enter Hostel ID: ");
        String hostelID = sc.nextLine();
        System.out.println("Enter number of Hostel Rooms: ");
        int numberOfHostelRooms = sc.nextInt();


        return 1;
    }
}
