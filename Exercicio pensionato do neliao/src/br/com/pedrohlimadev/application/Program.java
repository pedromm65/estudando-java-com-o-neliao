package br.com.pedrohlimadev.application;

import java.util.Scanner;

import br.com.pedrohlimadev.entities.Room;
import br.com.pedrohlimadev.entities.Tenant;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Room[] rooms = new Room[10];
        System.out.println(rooms);


        System.out.print("How many rooms will be rented? ");
        int quantity = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < quantity; i++) {
            
            String name = sc.nextLine();
            String email = sc.nextLine();

            int room = sc.nextInt();
            Tenant tenant = new Tenant(name, email);
            rooms[room] = new Room(tenant);
            sc.nextLine();
        }

        System.out.println();

        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i++) {
            if(rooms[i] != null) {
                System.out.println(i + ": " + rooms[i].tenant.name + ", " + rooms[i].tenant.email);
            }
        }

        sc.close();

    }
}
