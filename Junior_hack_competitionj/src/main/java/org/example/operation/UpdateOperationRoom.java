package org.example.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.example.DTO.StudentDTO;
import org.example.databaseConnection.DatabaseConnection;

public class UpdateOperationRoom implements Operation{

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return updateRoomOperation(databaseConnection, operation);
    }
    private Object updateRoomOperation(Connection databaseConnection, Object operation) {

        String sql = "update `rooms` SET `room_id`=?,`hostel_id`= ?,`room_number`= ?,`capacity`= ? ,`available_capacity`= ? WHERE room_id = ?";

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
