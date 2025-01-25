package org.example.interfaces;

import org.example.DTO.HostelsDTO;
import org.example.databaseConnection.DatabaseConnection;
import org.example.operation.AddOperationHostel;

import java.sql.SQLException;
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

        HostelsDTO hostel = new HostelsDTO(hostelID, hostelName, numberOfHostelRooms);
        DatabaseConnection databaseConnection = new DatabaseConnection();
        AddOperationHostel addOperationHostel = new AddOperationHostel();

        try {
            String result = (String) addOperationHostel.operation(databaseConnection.getConnection(),hostel);
            System.out.println(result);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }


        return 1;
    }
}
