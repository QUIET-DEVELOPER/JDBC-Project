package com.project;

public class Query {
    static String insert = "INSERT INTO employee(id, ename, email, salary) VALUES (?, ?, ?, ?)";
    static String update = "UPDATE employee SET ename = ? WHERE id = ?";
    static String delete = "DELETE FROM employee WHERE id = ?";
    static String select = "SELECT * FROM employee";
}
