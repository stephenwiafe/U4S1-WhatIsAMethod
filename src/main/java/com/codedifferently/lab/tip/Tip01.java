package com.codedifferently.lab.tip;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)
        double[] amt = {10, 12, 9, 8, 7, 15, 11, 30};
        double tax = 0.05;
        double tip = 0.15;

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        for (int i = 0; i < amt.length; i++) {
            double amount = amt[i];
            double total = amount + (amount * tax) + (amount * tip);
            System.out.printf("Person %d after taxes: $%.0f%n", i + 1, total);
        }
    }
}
