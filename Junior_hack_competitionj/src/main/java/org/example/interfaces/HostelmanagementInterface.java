package org.example.interfaces;

import java.util.Scanner;

public class HostelmanagementInterface {

    public int createHostelmanagementInterface() {

        Scanner input = new Scanner(System.in);
        System.out.println("Hostel Management.....\n\n");
        System.out.println("[1] Add hostels\n");
        System.out.println("[2] Update hostel information\n");
        System.out.println("[3] View Hostel Details\n");
        System.out.println("[4] Room Management\n");
        System.out.println("[0] Exit\n");

        int optionHostelManagement = input.nextInt();
        return optionHostelManagement;
    }
}
