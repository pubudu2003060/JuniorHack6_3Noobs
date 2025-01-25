package org.example.operation;

import org.example.DTO.AllocationDTO;
import org.example.DTO.RoomsDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewOperationRoom implements Operation {
    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return viewRoomOperation(databaseConnection, operation);
    }

    private Object viewRoomOperation(Connection databaseConnection, Object operation) {

        String sql = "select * from rooms where room_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1, operation.toString());

            ResultSet responce = preparedStatement.executeQuery();

            RoomsDTO allocations = new RoomsDTO();

            if(responce.next()) {

                allocations.setRoom_number(responce.getInt("room_number"));
                allocations.setRoom_id(responce.getString("room_id"));
                allocations.setCapacity(responce.getInt("capacity"));
                allocations.setHostel_id(responce.getString("hostel_id"));
                allocations.setAvailable_capacity(responce.getInt("available_capacity"));

                return allocations;
            }else {
                return null;
            }
        } catch (Exception e) {
            return "Error occured while viewing room operation";
        }
    }


}


