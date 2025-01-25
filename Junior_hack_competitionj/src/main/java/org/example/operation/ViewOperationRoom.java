package org.example.operation;

import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ViewOperationRoom implements Operation {
    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return viewRoomOperation(databaseConnection, operation);
    }

    private Object viewRoomOperation(Connection databaseConnection, Object operation) {

        String sql = "select * from rooms where room_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1, operation.toString());
            preparedStatement.setString(2, operation.toString());
            preparedStatement.setString(3, operation.toString());
            int responce = preparedStatement.executeUpdate();
            if (responce > 0) {
                return "Data viewed successfully";
            } else {
                return "Data not viewed";
            }
        } catch (Exception e) {
            return "Error occured while viewing room operation";
        }
    }


}


