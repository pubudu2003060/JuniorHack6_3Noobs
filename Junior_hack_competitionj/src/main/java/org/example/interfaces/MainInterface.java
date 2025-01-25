package org.example.interfaces;

import java.util.Scanner;

public class MainInterface {
    public int createMainPage(){

        Scanner mainOption = new Scanner(System.in);
        System.out.println("--------Welcome to Hostel Management System--------\n");
        System.out.println("-----ABC university-----\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Plase enter the number of actions you want to proceed..\n\n\n");
        System.out.println("[1] ManageHostels\n");
        System.out.println("[2] Manage Students\n");
        System.out.println("[3] Manage Student Allocations\n");
        System.out.println("[0] Exit\n");

        int optionMain = mainOption.nextInt();

        return optionMain;

    }
}
