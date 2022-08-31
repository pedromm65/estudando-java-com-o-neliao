package br.com.pedrohlimadev.application;


import java.util.Locale;
import java.util.Scanner;

import br.com.pedrohlimadev.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double dolarPrice = sc.nextDouble();

        System.out.println();

        System.out.print("How many dollars will be bought: ");
        double quantity = sc.nextDouble();

        System.out.println();

        System.out.println("Amout to be paid in reais = " + CurrencyConverter.converter(dolarPrice, quantity) );


        sc.close();

    }

}
