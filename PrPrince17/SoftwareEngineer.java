package PrPrince17;

public class SoftwareEngineer extends Developer {
    private double baseSalary;

    public SoftwareEngineer(String employeeID, String name, double baseSalary) {
        super(employeeID, name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 500; // Example calculation
    }
}