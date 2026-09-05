package Design_Patterns.Factory;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        return switch (type) {
            case "IT" -> new ItEmployee();
            case "Insurance" -> new InsuranceEmployee();
            default -> new HREmployee();
        };
    }
}
