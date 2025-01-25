package org.example.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.example.DTO.StudentDTO;
import org.example.databaseConnection.DatabaseConnection;

public class UpdateOperationHostel implements Operation{

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return updateHostelOperation(databaseConnection, operation);
    }
    private Object updateHostelOperation(Connection databaseConnection, Object operation) {

        String sql = "update `hostels` SET `hostel_id`=?,`hostel_name`= ?,`number_of_rooms`= ? WHERE hostel_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1, operation.toString());
            preparedStatement.setString(2, operation.toString());
            preparedStatement.setString(3, operation.toString());
            preparedStatement.setString(4, operation.toString());
            int responce = preparedStatement.executeUpdate();
            if (responce > 0) {
                return "Data updated successfully";
            } else {
                return "Data not updated";
            }
        } catch (Exception e) {
            return "Error occured while updating operation";
        }
    }
}
