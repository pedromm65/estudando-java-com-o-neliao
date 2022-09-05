package br.com.pedrohlimadev.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        //Pega a hora no padrão GMT -3H horario de SP
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-09-05");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");

        //UTC
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //Está imprimindo 3 horas a mais pq o UTC pega como base o horario de Londres, ai
        // Quando eu uso o -03:00 ele pega como referencia o horario de SP, então quando for,
        // 01:30 em SP será 04:30 em Londres
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 07, 29);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 27, 05, 53, 14);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
