package Design_Patterns.Strategy;

import Design_Patterns.Factory.Employee;

public class EmployeeType {
    Employee employee;
    EmployeeType(Employee employee){
        this.employee = employee;
    }
    public void printType(){
        var result = employee.getEmployeeType();
        System.out.printf("Did using strategy -->  %s%n", result);
    }
}
