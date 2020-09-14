package main.java.singleresponsibility.clients;

import main.java.singleresponsibility.domain.Employee;
import main.java.singleresponsibility.domain.dao.EmployeeDAO;
import main.java.singleresponsibility.report.EmployeeReportFormatter;
import main.java.singleresponsibility.report.FormatType;

public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        ClientModule.terminateEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
