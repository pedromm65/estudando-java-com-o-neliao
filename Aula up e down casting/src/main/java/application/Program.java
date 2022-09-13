package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        //UPCASTING - DA CLASSE PAI PRA CLASSE FILHA
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1002, "Maria", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);



        //DOWNCASTING DA CLASSE FILHA PARA CLASSE PAI
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //SO VAI DAR PROBLEMA NA HORA DE RODAR O CODIGO
        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }


        //AULA SOBREPOSICAO - OVERRIDE E SUPER

        Account account1 = new Account(1001, "Alex", 1000.0);
        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

        Account account2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1002, "Maria", 1000.0, 0.01);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());

        //AULA SObre polimorfismo

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}
