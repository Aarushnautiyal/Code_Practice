package Design_Patterns.Factory;

public class Main {
    public static void main(String[] args) {
        Employee e = EmployeeFactory.getEmployee("IT");
        System.out.println(e.getEmployeeType());
    }
}
