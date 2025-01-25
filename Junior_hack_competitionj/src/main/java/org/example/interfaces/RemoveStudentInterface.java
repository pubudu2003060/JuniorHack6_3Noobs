package org.example.interfaces;

import java.util.Scanner;

public class RemoveStudentInterface {
    public static String craeteRemoveStudentInterface() {
        System.out.println("Removing a student....\n");
        Scanner option=new Scanner(System.in);
        System.out.println("Student Id");
        int studentId=option.nextInt();
        System.out.println("\n");
        System.out.println("Do you want to remove student " +studentId+ "? (Y/N)");
        String answer=option.next();
        option.nextLine();

        return answer;



    }
}
