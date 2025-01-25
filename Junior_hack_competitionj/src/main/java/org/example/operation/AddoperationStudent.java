package org.example.operation;

import org.example.databaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddoperationStudent implements Operation {


    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return addoperation(databaseConnection, operation);
    }

    private Object addoperation(Connection databaseConnection, Object operation) {

        String sql = "insert into student(student_id,name,age,department) values(?,?,?,?)";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1, operation.toString());
            preparedStatement.setString(2, operation.toString());
            preparedStatement.setString(3, operation.toString());
            preparedStatement.setString(4, operation.toString());
            int responce = preparedStatement.executeUpdate();
            if (responce > 0) {
                return "Data added successfully";
            } else {
                return "Data not added";
            }
        } catch (Exception e) {
            return "Error occured while adding operation";
        }
    }


}
