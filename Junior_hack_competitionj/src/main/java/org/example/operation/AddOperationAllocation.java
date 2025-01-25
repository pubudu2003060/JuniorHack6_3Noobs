package org.example.operation;

import org.example.DTO.AllocationDTO;
import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddOperationAllocation implements Operation {

    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return addOperation(databaseConnection, operation);
    }

    private Object addOperation(Connection databaseConnection, Object operation) {

        String sql = "insert into allocations(student_id,room_id) values(?,?)";

        try (PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql)) {

            AllocationDTO allocationDTO = (AllocationDTO) operation;

            preparedStatement.setString(2, allocationDTO.getStudent_id());
            preparedStatement.setString(3, allocationDTO.getRoom_id());

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

