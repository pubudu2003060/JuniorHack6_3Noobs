package org.example.operation;

import org.example.DTO.HostelsDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddOperationHostel implements Operation {

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return addOperation(databaseConnection, operation);
    }

    private Object addOperation(Connection databaseConnection, Object operation) {

        String sql = "insert into hostels(hostel_id,hostel_name,number_of_rooms) values(?,?,?)";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {

            HostelsDTO hostelsDTO = (HostelsDTO) operation;

            preparedStatement.setString(1, hostelsDTO.getHostel_id());
            preparedStatement.setString(2, hostelsDTO.getHostel_name());
            preparedStatement.setInt(3, hostelsDTO.getNumber_of_rooms());

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

