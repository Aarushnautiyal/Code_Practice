package Design_Patterns.Strategy;

import Design_Patterns.Factory.Employee;
import Design_Patterns.Factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Insurance");
        EmployeeType emp = new EmployeeType(employee);
        emp.printType();
    }
}
