package org.example.operation;

import org.example.databaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ViewOperationStudent implements Operation {
    @Override
    public Object operation(Connection databaseConnection, Object operation) {
        return viewStudentOperation(databaseConnection, operation);
    }

    private Object viewStudentOperation(Connection databaseConnection, Object operation) {

        String sql = "select * from students where student_id = ?";

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
            return "Error occured while viewing student operation";
        }
    }


}


