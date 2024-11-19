package PrPrince17;

public class TeamLead extends Manager {
    private double baseSalary;

    public TeamLead(String employeeID, String name, double baseSalary) {
        super(employeeID, name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 1000; // Example calculation
    }
}