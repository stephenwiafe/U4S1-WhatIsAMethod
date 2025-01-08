package com.codedifferently.lab.calc2;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;
    public double[] originalPrice = {};  // Original price array

    //Calculate an individual's total after tax and tip
    //Print this value
    public void findTotal(){
        double tot = 0.0;

        for (double price : originalPrice) {
            double taxPrice = price + (price * tax);  // Adding tax
            double tips = taxPrice + (taxPrice * tip);
            tot += tips;
        }
        // Print the total value after tax and tip
        System.out.println(tot);
    }

    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();
        calculator.originalPrice = new double[]{50.0, 75.0, 100.0};
        calculator.findTotal();
    }
}