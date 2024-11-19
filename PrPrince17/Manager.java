package PrPrince17;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager implements Employee {
    private String employeeID;
    private String name;
    private List<String> tasks = new ArrayList<>();

    public Manager(String employeeID, String name) {
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
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Tasks: " + tasks);
        System.out.println("Salary: " + calculateSalary());
    }
}