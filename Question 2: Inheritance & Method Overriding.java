class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee F1;
        Employee F2;

        F1 = new FullTimeEmployee(30000);
        F2 = new PartTimeEmployee(80, 200);

        System.out.println(F1.calculateSalary());
        System.out.println(F2.calculateSalary());
    }
}
