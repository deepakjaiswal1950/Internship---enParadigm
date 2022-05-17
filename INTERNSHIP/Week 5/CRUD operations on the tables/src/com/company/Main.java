package com.company;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        //Connection connection = dbConnection.getConnection(); // call connection

        // Insert data into table
        //insertStudent();

        //Update table data
        //updateStudent();

        // Delete data from table
        deleteStudent();
    }

    private static void insertStudent() {
        try(Connection connection = dbConnection.getConnection();Statement st = connection.createStatement();) {

            String SQLINSERT = "INSERT INTO studentDetails(usn, name)"
                    + "VALUES('1VA18CS011','Deepak Jaiswal')";
            int executeUpdate = st.executeUpdate(SQLINSERT);
            if(executeUpdate == 1){
                System.out.println("Student detail is inserted...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void updateStudent() {
        try(Connection connection = dbConnection.getConnection();Statement st = connection.createStatement();) {

            String SQLINSERT = "UPDATE studentDetails set name='DJ' WHERE usn = '1VA18CS010'";
            int executeUpdate = st.executeUpdate(SQLINSERT);
            if(executeUpdate == 1){
                System.out.println("Student detail is updated...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent() {
        try(Connection connection = dbConnection.getConnection();Statement st = connection.createStatement();) {

            String SQLINSERT = "DELETE FROM studentDetails WHERE usn = '1VA18CS010'";
            int executeUpdate = st.executeUpdate(SQLINSERT);
            if(executeUpdate ==1){
                System.out.println("Student detail is deleted...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
