package com.project;

public class Employee {
    private int id;
    private String ename;
    private String email;
    private int salary;

    public Employee(int id, String ename, String email, int salary) {
        this.id = id;
        this.ename = ename;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return ename;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [id: " + id + ", name: " + ename + ", email: " + email + ", salary: " + salary + "]";
    }
}

