package com.company;

import java.sql.*;

public class dbConnection {

    static String dbURL = "jdbc:mysql://localhost:3306/crud"; // specify database name
    static String username = "root";
    static String password = "";

    static Connection connection = null;


    static {
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

    static Connection getConnection() {
        return connection;  // this method will call from client program
    }
}
