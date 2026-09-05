package Design_Patterns.Factory;

public final class HREmployee implements Employee {
    @Override
    public String getEmployeeType() {
        return "I am an HR Employee";
    }
}
