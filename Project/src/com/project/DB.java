package com.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    static Connection con = null;
    
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/EmployeeManagement";
            String username = "root";
            String password = "password";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return con;
    }
}
