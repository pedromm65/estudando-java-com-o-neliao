package br.com.pedrohlimadev.util;

public class CurrencyConverter {
    public static double converter(double dolarPrice, double quantity) {
        
        double tax = (dolarPrice * quantity) * 0.06;
        double grossQuantity = dolarPrice * quantity;

        double finalValue = grossQuantity - tax;
        
        return finalValue;
    }
}
