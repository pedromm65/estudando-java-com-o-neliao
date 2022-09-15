package Application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);

            if(type == 'c') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                Product product = new Product(name, price);
                list.add(product);
            } else if (type == 'u') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manuDate = sc.next();

                Product product = new UsedProduct(name, price, sdf.parse(manuDate));
                list.add(product);
            } else if (type == 'i') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                Double customFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customFee);
                list.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
