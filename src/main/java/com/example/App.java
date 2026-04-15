package com.example;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;

    // Constructor
    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Calculate HRA (20%)
    double calculateHRA() {
        return basicSalary * 0.20;
    }

    // Calculate DA (10%)
    double calculateDA() {
        return basicSalary * 0.10;
    }

    // Calculate Gross Salary
    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Display details
    void display() {
        System.out.println("\n----- PAYSLIP -----");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.display();
    }
}
