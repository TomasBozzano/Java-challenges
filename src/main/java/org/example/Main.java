package org.example;

import controllers.ControllerExchange;
import models.Exchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = """
                ==============================
                |   Bienvenidos al conversor |
                |   de monedas               |
                ==============================
                | 1. Dolar -> Peso Argentino |
                | 2. Peso Argentino -> Dolar |
                | 3. Dolar -> Real Brasilero |
                | 4. Real Brasilero -> Dolar |
                | 5. Dolar -> Peso Colombiano|
                | 6. Peso Colombiano -> Dolar|
                | 7. Salir                   |
                """;
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(menu);

        while(running){
            String option = scanner.nextLine();
            ControllerExchange control = new ControllerExchange();
            Exchange exchange = control.getExchangeConnection();
            switch (option) {
                case "1" -> {
                    System.out.println("Has seleccionado Dolar -> Peso Argentino");
                    double result = exchange.convert("USD", "ARS");
                    System.out.printf("1 Dolar equivale a %.2f Pesos Argentinos%n", result);
                }
                case "2" -> {
                    System.out.println("Has seleccionado Peso Argentino -> Dolar");
                    double result = exchange.convert("ARS", "USD");
                    System.out.printf("1 Peso Argentino equivale a %.4f Dolares%n", result);
                }
                case "3" -> {
                    System.out.println("Has seleccionado Dolar -> Real Brasilero");
                    double result = exchange.convert("USD", "BRL");
                    System.out.printf("1 Dolar equivale a %.2f Reales Brasileros%n", result);
                }
                case "4" -> {
                    System.out.println("Has seleccionado Real Brasilero -> Dolar");
                    double result = exchange.convert("BRL", "USD");
                    System.out.printf("1 Real Brasilero equivale a %.4f Dolares%n", result);
                }
                case "5" -> {
                    System.out.println("Has seleccionado Dolar -> Peso Colombiano");
                    double result = exchange.convert("USD", "COP");
                    System.out.printf("1 Dolar equivale a %.2f Pesos Colombianos%n", result);
                }
                case "6" -> {
                    System.out.println("Has seleccionado Peso Colombiano -> Dolar");
                    double result = exchange.convert("COP", "USD");
                    System.out.printf("1 Peso Colombiano equivale a %.4f Dolares%n", result);
                }
                case "7" -> {
                    System.out.println("Saliendo del programa...");
                    running = false;
                }
                default -> System.out.println("Opción no válida. Por favor, selecciona una opción del menú.");
            }
            System.out.println(menu);
        }


    }
}