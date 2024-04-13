package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while(true) {
            System.out.println("\n Employee Management");
            System.out.println(" 1. Create \n 2. Read \n 3. Update \n 4. Delete");
            System.out.print("Enter operation you want to perform : ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice < 1 || choice > 5) {
            	System.out.println("Invalid Operation!, please enter correct choice");
                break;
            }
            switch(choice) {


                case 1: 
                    System.out.println("id, ename, email, salary ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String ename = sc.nextLine();
                    String email = sc.nextLine();
                    int salary = sc.nextInt();
                    Employee emp = new Employee(id,ename,email,salary);
                    EmployeeDBO.createEmployee(emp);
                break;

                
                case 2: 
                    ArrayList<Employee> list = EmployeeDBO.readAllEmployee();
                    for(Employee employee : list) {
                        System.out.println(employee);
                    } 
                break;


                case 3: 
                    System.out.println("id & name ");
                    id = sc.nextInt();
                    sc.nextLine();
                    ename = sc.nextLine();
                    EmployeeDBO.updateEmployee(id,ename);
                break;


                case 4:
                    System.out.println("id");
                    id = sc.nextInt();
                    EmployeeDBO.deleteEmployee(id);
                break;

            }

        }
    }
}

