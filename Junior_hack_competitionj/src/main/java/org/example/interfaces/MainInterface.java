package org.example.interfaces;

import java.util.Scanner;

public class MainInterface {

    public int createMainPage(){

        Scanner mainOption = new Scanner(System.in);
        System.out.println("--------Welcome to Hostel Management System--------");
        System.out.println("            -----ABC university-----");
        System.out.println("Plase enter the number of actions you want to proceed..");
        System.out.println("[1] ManageHostels");
        System.out.println("[2] Manage Students");
        System.out.println("[3] Manage Student Allocations");
        System.out.println("[0] Exit");
        System.out.print("Enter:");
        int optionMain = mainOption.nextInt();
        System.out.println("----------------------------------------------------");
        return optionMain;

    }
}
