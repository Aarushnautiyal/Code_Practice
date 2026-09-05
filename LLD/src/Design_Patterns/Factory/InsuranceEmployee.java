package Design_Patterns.Factory;

public final class InsuranceEmployee implements Employee {
    @Override
    public String getEmployeeType() {
        return "I am an HR Employee";
    }
}
