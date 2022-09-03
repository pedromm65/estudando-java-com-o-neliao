package br.com.pedrohlimadev.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.pedrohlimadev.entities.Product;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho do vetor ai mane: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] prod = new Product[n];

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            double price = sc.nextDouble();

            prod[i] = new Product(name, price);
        }

        double sumPrice = 0.0;

        for(int i = 0; i < n; i++) {
            sumPrice += prod[i].getPrice();
        }

        double averagePrice = sumPrice / 2;

        System.out.println("AVERAGE PRODUCTS PRICE: " + averagePrice);


        sc.close();
    }
}
