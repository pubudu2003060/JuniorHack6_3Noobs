package org.example.interfaces;

import java.util.Scanner;

public class ViewARoomByHostelIdInterface {
    public int creatViewRoomByHostelIdInterface (){
        System.out.println("View Rooms...\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Hostel ID (eg: hos001): ");
        int hostelId = input.nextInt();
        input.nextLine();

        return 1;

    }
}
