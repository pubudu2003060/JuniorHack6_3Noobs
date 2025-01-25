package org.example;

import org.example.interfaces.HostelmanagementInterface;
import org.example.interfaces.MainInterface;
import org.example.interfaces.StudentAllocationManagentInterface;
import org.example.interfaces.StudentManagementInterface;

public class Application {

    private static MainInterface  mainInterface = new MainInterface();
    private static HostelmanagementInterface hostelmanagementInterface = new HostelmanagementInterface();
    private static StudentManagementInterface studentManagementInterface = new StudentManagementInterface();
    private static StudentAllocationManagentInterface studentAllocationManagentInterface = new StudentAllocationManagentInterface();


    public static void runApplication(){
        boolean run = true;
        while(run){
            int mainnum = mainInterface.createMainPage();
            switch (mainnum){
                case 1:hostelmanagementInterface.createHostelmanagementInterface();break;
                case 2:studentManagementInterface.createStudentManagement();break;
                case 3:studentAllocationManagentInterface.createStudentAllocationManagemntInterface();break;
                case 4:run = false;break;
                default: System.out.println("Invalid input");
            }
        }
    }
}
