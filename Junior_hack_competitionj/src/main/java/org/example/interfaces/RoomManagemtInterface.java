package org.example.interfaces;

import java.util.Scanner;

public class RoomManagemtInterface {

    public int createRoomManagementInterface() {
        Scanner option = new Scanner(System.in);

        System.out.println("Rooms Management.....\n\n");
        System.out.println("[1] Allocate Rooms\n");
        System.out.println("[2] View Rooms\n");
        System.out.println("[3] Update Rooms\n");
        System.out.println("[4] Delete Rooms\n");
        System.out.println("[0] main menu\n");

        int optionRoomManagement= option.nextInt();
        return optionRoomManagement;
    }
}
