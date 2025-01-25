package org.example.operation;

import org.example.DTO.AllocationDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ViewOperationAllocation implements Operation {

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return viewAllocationOperation(databaseConnection, operation);
    }

    private Object viewAllocationOperation(Connection databaseConnection, Object operation) {

        String sql = "select * from allocations where allocation_id = ?";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {
            preparedStatement.setInt(1, Integer.parseInt(operation.toString()));

            ResultSet responce = preparedStatement.executeQuery();
            AllocationDTO allocations = new AllocationDTO();

            if(responce.next()) {

                allocations.setAllocation_id(responce.getInt("allocation_id"));
                allocations.setRoom_id(responce.getString("room_id"));
                allocations.setAllocation_date(responce.getDate("allocation_date"));
                allocations.setStudent_id(responce.getString("student_id"));

                return allocations;
            }else {
                return null;
            }

        } catch (Exception e) {
            return "Error occured while viewing allocation operation";
        }
    }


}


