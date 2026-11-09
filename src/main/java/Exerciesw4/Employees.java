package Exerciesw4;

public class Employees {
    private String employeeName;
    private String employeeID;
    private String department;
    private double payRate;
    private double hoursworked;

    public Employees(String employeeName, String employeeID, String department, double payRate, double hoursworked) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.department = department;
        this.payRate = payRate;
        this.hoursworked = hoursworked;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursworked() {

        return hoursworked;
    }

    public double getRegularHoursWorked() {
        if (hoursworked > 40) {
            return 40;
        }
        return hoursworked;
    }

    public double getOverTimeHoursWorked() {
        if (hoursworked < 40) {
            return hoursworked - 40;
        }
        return 0;
    }
    public double getTotalPay() {
        return (getPayRate() * getRegularHoursWorked() + getOverTimeHoursWorked() * getPayRate() * 1.50);
    }
}
