package br.com.pedrohlimadev.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import br.com.pedrohlimadev.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Employee #" + i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            sc.nextLine();
            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        sc.nextLine();

        // for (Employee emp : list) {
        //     if (emp.getId() == id) {
        //         emp.setSalary(emp.increaseSalary(percentage));
        //     } else {
        //         System.err.println("User does not exists!");
        //     }
        // }

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("User does not exists!");
        } else {
            System.out.print("Enter with the percentage: ");
            double percentage = sc.nextDouble();

            emp.setSalary(emp.increaseSalary(percentage));
        }

        for (Employee x : list) {
            System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
        }

        sc.close();
    }
}
