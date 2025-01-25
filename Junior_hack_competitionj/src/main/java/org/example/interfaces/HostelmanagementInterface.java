package org.example.interfaces;

import java.util.Scanner;

public class HostelmanagementInterface {

    public int createHostelmanagementInterface() {

        Scanner input = new Scanner(System.in);
        System.out.println(".....Hostel Management.....");
        System.out.println("[1] Add hostels");
        System.out.println("[2] Update hostel information");
        System.out.println("[3] View Hostel Details");
        System.out.println("[4] Room Management");
        System.out.println("[0] Main Menu");

        int optionHostelManagement = input.nextInt();

        switch (optionHostelManagement) {
            case 1:
        }
        return optionHostelManagement;
    }
}
