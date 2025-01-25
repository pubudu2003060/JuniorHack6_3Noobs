package org.example.operation;

import org.example.DTO.AllocationDTO;
import org.example.DTO.StudentDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewOperationStudent implements Operation {
    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return viewStudentOperation(databaseConnection, operation);
    }

    private Object viewStudentOperation(Connection databaseConnection, Object operation) {

        String sql = "select * from students where student_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1, operation.toString());

            ResultSet responce = preparedStatement.executeQuery();

            StudentDTO allocations = new StudentDTO();

            if(responce.next()) {

                allocations.setStudent_id(responce.getString("student_id"));
                allocations.setAge(responce.getInt("age"));
                allocations.setDepartment(responce.getString("department"));
                allocations.setName(responce.getString("name"));

                return allocations;
            }else {
                return null;
            }
        } catch (Exception e) {
            return "Error occured while viewing student operation";
        }
    }


}


