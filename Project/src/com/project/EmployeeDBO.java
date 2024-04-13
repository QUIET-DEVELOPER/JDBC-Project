package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDBO {

    public static void createEmployee(Employee employee) throws SQLException {
        Connection con = DB.connect();
        String query = Query.insert;
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, employee.getId());
        pst.setString(2, employee.getName());
        pst.setString(3, employee.getEmail());
        pst.setInt(4, employee.getSalary());
        System.out.println("\n ps = " + pst + "\n" + employee);
        pst.executeUpdate();
        pst.close();
        con.close();
    }

    public static void updateEmployee(int id, String name) throws SQLException {
        Connection con = DB.connect();
        String query = Query.update;
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(2, id);
        pst.setString(1, name);
        System.out.println("\n ps = " + pst);
        pst.executeUpdate();
        pst.close();
        con.close();
    }

    public static ArrayList<Employee> readAllEmployee() throws SQLException {
        ArrayList<Employee> empList = new ArrayList<>();
        Connection con = DB.connect();
        String query = Query.select;
        Statement st = con.createStatement();
        System.out.println("\n st = " + st);
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            Employee emp = new Employee(rs.getInt("id"), rs.getString("ename"), rs.getString("email"), rs.getInt("salary"));
            empList.add(emp);
        }
        rs.close();
        st.close();
        con.close();
        return empList;
    }

    public static void deleteEmployee(int id) throws SQLException {
        Connection con = DB.connect();
        String query = Query.delete;
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        System.out.println("\n ps = " + pst);
        pst.executeUpdate();
        pst.close();
        con.close();
    }
}
