// package br.com.pedrohlimadev.application;

// import java.util.Locale;
// import java.util.Scanner;

// public class Program {
//     public static void main(String[] args) {
//         Locale.setDefault(Locale.US);
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Entra ai com quantas alturas: ");

//         int n = sc.nextInt();
        
//         double[] vect = new double[n];

//         for(int i = 0; i < n; i++) {
//             vect[i] = sc.nextDouble();
//         }

//         double sum = 0.0;

//         for(int i = 0; i < n; i++) {
//             sum += vect[i];
//             System.out.println();
//         }

//         int len = vect.length;

//         double averageHeight = sum / len;
  
//         System.out.printf("AVERAGE HEIGHT: %.2f%n ", averageHeight);

//         sc.close();
//     }
// }
