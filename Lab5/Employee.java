package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, double hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public double calculateDailyIncome() {
        return hourRate * capacity;
    }

    public double calculateMonthlyIncome() {
        return calculateDailyIncome() * (21 - freeDays);
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Hourly Rate: ");
            double hourRate = scanner.nextDouble();
            System.out.print("Capacity (work hours per day): ");
            int capacity = scanner.nextInt();
            System.out.print("Free Days: ");
            int freeDays = scanner.nextInt();

            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employees.add(employee);
        }

        System.out.println("\nMonthly Incomes:");
        for (Employee employee : employees) {
            System.out.println(employee.calculateMonthlyIncome() + " USD for " + employee.getName());
        }
    }
}
