package Application;

import entities.Company;
import entities.Individual;
import entities.Pessoa;
import entities.enums.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + "data: ");
            System.out.println("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            if(ch == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double income = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthIncomes = sc.nextDouble();

                list.add(new Individual(name, income, healthIncomes));
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double income = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, income, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Pessoa p : list) {
            double tax = p.tax();
            System.out.println(p.getName() + ": $ " + String.format("%.2f", tax));
            sum+= tax;
        }
        System.out.println();
        System.out.println("Total Taxes: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
