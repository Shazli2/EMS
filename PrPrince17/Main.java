package PrPrince17;

public class Main {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead("TL001", "Alice", 5000);
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("SE001", "Bob", 3000);

        teamLead.assignTask("Lead the project");
        softwareEngineer.assignTask("Develop the module");

        teamLead.printEmployeeDetails();
        softwareEngineer.printEmployeeDetails();
    }
}
/*Employee Management System
Problem:
Design an employee management system that categorizes employees into different types
based on their roles and manages their tasks and salaries.
Employee Interface:
Define an Employee interface with the following methods:
String getEmployeeID()
String getName()
double calculateSalary()
void assignTask(String task)
void printEmployeeDetails()
Abstract Classes:
Create two abstract classes, Manager and Developer, that implement the Employee interface. These classes should:
Store basic details such as employee ID, name, and assigned tasks.
Define salary calculation logic.
Concrete Classes:
Create two concrete classes:
TeamLead, which extends Manager.
SoftwareEngineer, which extends Developer.
Main Program:
Create instances of TeamLead and SoftwareEngineer.
Assign tasks to employees and calculate their salaries.
Print the details of each employee and their assigned tasks.
 */