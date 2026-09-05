package Design_Patterns.Factory;

public sealed interface Employee permits HREmployee, InsuranceEmployee, ItEmployee {
    String getEmployeeType();
}
