package org.example;

import org.example.databaseConnection.DatabaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();

        try {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}