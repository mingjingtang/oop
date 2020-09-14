package main.java.singleresponsibility.domain.dao;

import main.java.singleresponsibility.domain.Employee;

public class EmployeeDAO {
//    private DatabaseConnectionManager databaseConnectionManager;

    public void saveEmployee(Employee emp){
        System.out.println("save employee data " + emp.getName());
    }

    public void deleteEmployee(Employee emp){
        System.out.println("delete employee data " + emp.getName());
    }
}
