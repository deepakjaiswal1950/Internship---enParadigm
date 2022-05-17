package com.company;

import java.sql.*;

public class dbConnection {

    String dbURL = "jdbc:mysql://localhost:3306/demo"; // specify database name
    String username = "root";
    String password = "";

    Connection connection;


    public dbConnection() {
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          connection = DriverManager.getConnection(dbURL, username, password);
          if(connection != null) {
              System.out.println("Success");
          }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
