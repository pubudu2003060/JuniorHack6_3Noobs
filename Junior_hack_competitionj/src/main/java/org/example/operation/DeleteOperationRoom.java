package org.example.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteOperationRoom implements Operation {

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return deleteOperation(databaseConnection, operation);
    }

    private Object deleteOperation(Connection databaseConnection, Object operation) {

        String sql = "delete from rooms where room_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {

            preparedStatement.setString(1, operation.toString());

            int responce = preparedStatement.executeUpdate();

            if (responce > 0) {
                return "Data delete successfully";
            } else {
                return "Data deleted fail";
            }
        } catch (Exception e) {
            return "Error occured while delete operation: " + e.getMessage();
        }
    }
}
