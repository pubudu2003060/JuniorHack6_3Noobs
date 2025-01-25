package org.example.interfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ViewARecordInterface {
    public int createViewAStudentRecord() {
        System.out.println("View Student details\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int studentID = input.nextInt();
        input.nextLine();

        return 1;
    }

}
