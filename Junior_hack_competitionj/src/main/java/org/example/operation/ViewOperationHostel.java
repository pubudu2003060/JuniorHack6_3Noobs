package org.example.operation;

import org.example.DTO.AllocationDTO;
import org.example.DTO.HostelsDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewOperationHostel implements Operation {
    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return viewHostelOperation(databaseConnection, operation);
    }

    private Object viewHostelOperation(Connection databaseConnection, Object operation) {

        String sql = "select * from hostels where hostel_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setString(1, operation.toString());

            ResultSet responce = preparedStatement.executeQuery();
            HostelsDTO allocations = new HostelsDTO();

            if(responce.next()) {

                allocations.setHostel_id(responce.getString("hostel_id"));
                allocations.setHostel_name(responce.getString("hostel_name"));
                allocations.setNumber_of_rooms(responce.getInt("number_of_rooms"));

                return allocations;
            }else {
                return null;
            }
        } catch (Exception e) {
            return "Error occured while viewing hostel operation";
        }
    }


}


