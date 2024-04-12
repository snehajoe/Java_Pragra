package assignment4;

public class EmployeePayRollMain {
    public static void main(String[] args) {

        EmployeePayRoll employee = new EmployeePayRoll(123, "Joe", 500.0, "Software Engineer");

        employee.calcGrossSalary(20,40);
        employee.calcDeductions(10);
        employee.calcNetSalary();
        employee.displayEmployeeDetails();
    }
}
