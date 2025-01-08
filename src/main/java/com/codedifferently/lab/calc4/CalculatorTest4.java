package com.codedifferently.lab.calc4;

public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends
        calc.findTotal(10, null);
        calc.findTotal(12, null);
        calc.findTotal(9,  null);
        calc.findTotal(8,  null);
        calc.findTotal(7,  null);
        calc.findTotal(15, "Alex");
        calc.findTotal(11, null);
        calc.findTotal(30, "Forgetful");

        String[] names = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Alex", "Person 7", "Forgetful"};
        double[] prices = {10, 12, 9, 8, 7, 15, 11, 30};

        double tot = 0.0;

        //Find and print the entire table's total, including tax and tip
        for (int i = 0; i < prices.length; i++) {
            calc.findTotal(prices[i], names[i]);
            tot += prices[i] * (1 + calc.tax + calc.tip);
        }
        System.out.println("\n$" + tot);
    }
}