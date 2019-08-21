package com.ardakazanci.database_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {

        DatabaseHelper dbHelper = new DatabaseHelper();
        Connection connection = null;

        try {
            connection = dbHelper.getConnection();
        } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);
        } finally {
            connection.close();
        }


    }
}
