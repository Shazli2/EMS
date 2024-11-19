package PrPrince17;

import java.util.ArrayList;
import java.util.List;

public abstract class Developer implements Employee {
    private String employeeID;
    private String name;
    private List<String> tasks = new ArrayList<>();

    public Developer(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    @Override
    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void assignTask(String task) {
        tasks.add(task);
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("Developer ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Tasks: " + tasks);
        System.out.println("Salary: " + calculateSalary());
    }
}