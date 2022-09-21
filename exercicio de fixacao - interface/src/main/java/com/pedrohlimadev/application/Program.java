package com.pedrohlimadev.application;

import com.pedrohlimadev.entities.Contract;
import com.pedrohlimadev.entities.Installment;
import com.pedrohlimadev.service.ContractService;
import com.pedrohlimadev.service.OnlinePaymentService;
import com.pedrohlimadev.service.PaypalService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy)");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int N = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, N);

        System.out.println("Installments: ");
        for (Installment it : contract.getInstallment()) {
            System.out.println(it);
        }

        sc.close();
    }
}
