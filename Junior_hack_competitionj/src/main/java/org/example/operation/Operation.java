package org.example.operation;

import org.example.databaseConnection.DatabaseConnection;

import java.sql.Connection;

public interface Operation {

    public Object operation(Connection databaseConnection, Object operation);

}
