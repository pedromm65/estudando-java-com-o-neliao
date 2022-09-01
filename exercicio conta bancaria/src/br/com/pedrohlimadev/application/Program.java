package br.com.pedrohlimadev.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.pedrohlimadev.entities.Account;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter the holder: ");
        String holder = sc.nextLine();

        System.out.println();

        System.out.print("Is there a initial deposit (y/n)?");

        char response = sc.next().charAt(0);

        if (response == 'n') {
            account = new Account(number, holder);
        } else if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double quantity = sc.nextDouble();

        account.deposit(quantity);
        System.out.println();

        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        quantity = sc.nextDouble();

        account.withdraw(quantity);

        System.out.println();
        System.out.println(account);
        sc.close();
    }
}
