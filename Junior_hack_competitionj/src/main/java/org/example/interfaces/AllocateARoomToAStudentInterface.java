package org.example.interfaces;

import java.util.Scanner;

public class AllocateARoomToAStudentInterface {
    public int createARoomToAStudentInterface() {
        System.out.println("Allocate a Room to a Student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Id: ");
        int studentId = sc.nextInt();

        System.out.println("Hostel Id: ");
        int hostelId = sc.nextInt();

        System.out.println("Choose a room to allocate (room Id): ");
        int roomId = sc.nextInt();

        return 1;


    }
}
