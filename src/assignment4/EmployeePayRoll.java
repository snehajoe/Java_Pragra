package assignment4;

public class EmployeePayRoll {
    int employeeId;
    String employeeName;
    double basicSalary;
    String designation;

    double grossSalary, deductions, netSalary;

    public EmployeePayRoll(int employeeId, String employeeName, double basicSalary, String designation){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    public double calcGrossSalary(double hourlyPay, double hoursWorked){
        grossSalary= hourlyPay * hoursWorked;
        return grossSalary;
    }

    public double calcDeductions(double taxRate){
        deductions = grossSalary * (taxRate / 100);
        return  deductions;
    }

    public double calcNetSalary(){
        netSalary = grossSalary - deductions;
        return netSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Deductions: $" + deductions);
        System.out.println("Net Salary: $" + netSalary);
    }

}
