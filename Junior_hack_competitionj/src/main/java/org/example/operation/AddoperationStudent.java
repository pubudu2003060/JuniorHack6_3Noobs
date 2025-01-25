package org.example.operation;

import org.example.DTO.StudentDTO;
import org.example.databaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddoperationStudent implements Operation {

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return addOperation(databaseConnection, operation);
    }

    private Object addOperation(Connection databaseConnection, Object operation) {

        String sql = "insert into students(student_id,name,age,department) values(?,?,?,?)";
        StudentDTO studentDTO = (StudentDTO) operation;

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1,studentDTO.getStudent_id());
            preparedStatement.setString(2, studentDTO.getName());
            preparedStatement.setInt(3, studentDTO.getAge());
            preparedStatement.setString(4, studentDTO.getDepartment());

            int responce = preparedStatement.executeUpdate();

            if (responce > 0) {
                return "Data added successfully";
            } else {
                return "Data not added";
            }

        } catch (Exception e) {
            return "Error occured while adding operation:"+e.getMessage();
        }
    }


}
