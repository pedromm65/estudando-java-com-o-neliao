package br.com.pedrohlimadev.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Program {
    public static void main(String[] args) {

        
        LocalDate d04 = LocalDate.parse("2022-09-05");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        
        LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));



        // System.out.println(r1);
        // System.out.println(d06);
        // System.out.println(r2);
        // System.out.println(r3);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia da semana = " + d04.getDayOfWeek());
        System.out.println("d04 mes = " + d04.getMonth());

        System.out.println("----------------------------");

        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 hora = " + d05.getMinute());



        // for (String s : ZoneId.getAvailableZoneIds()) {
        //     System.out.println(s);
        // }        
        
    }
}
