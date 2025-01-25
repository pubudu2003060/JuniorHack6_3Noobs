package org.example.operation;

import org.example.DTO.RoomsDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddOperationRoom implements Operation {

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return addOperation(databaseConnection, operation);
    }

    private Object addOperation(Connection databaseConnection, Object operation) {

        String sql = "insert into rooms(room_id,hostel_id,room_number,capacity,available_capacity) values(?,?,?,?,?)";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {

            RoomsDTO roomDTO = (RoomsDTO) operation;

            preparedStatement.setString(1, roomDTO.getRoom_id());
            preparedStatement.setString(2, roomDTO.getHostel_id());
            preparedStatement.setInt(3, roomDTO.getRoom_number());
            preparedStatement.setInt(4,roomDTO.getCapacity());
            preparedStatement.setInt(5, roomDTO.getAvailable_capacity());

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

