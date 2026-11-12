
package com.example.shopping_discount_calculator;

public class App {

    public double calculateDiscount(double amount, double discount) {

        if (amount < 0 || discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Invalid input");
        }

        return amount - (amount * discount / 100);
    }

    public static void main(String[] args) {

        App app = new App();

        double result = app.calculateDiscount(2000, 10);

        System.out.println("Final Amount: " + result);
    }
}
