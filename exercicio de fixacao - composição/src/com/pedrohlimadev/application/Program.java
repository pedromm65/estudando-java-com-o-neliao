package com.pedrohlimadev.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.pedrohlimadev.entities.Client;
import com.pedrohlimadev.entities.Order;
import com.pedrohlimadev.entities.OrderItem;
import com.pedrohlimadev.entities.Product;
import com.pedrohlimadev.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Pegando os dados do cliente e instanciando ele
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.next();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String clientBithDate = sc.next();
        System.out.println();

        Client client = new Client(clientName, clientEmail, sdf.parse(clientBithDate));

        //Pegando os dados do pedido e instanciando ele
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();

        //Instanciando o Order
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();


        //Pegando os dados do produto e instanciando ele para depois instanciar o pedido
        for(int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println(order);

        
        sc.close();
    }
}
