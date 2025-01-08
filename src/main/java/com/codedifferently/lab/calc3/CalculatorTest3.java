package com.codedifferently.lab.calc3;

public class CalculatorTest3 {
    public static void main(String[] args) {

        Calculator3 calc = new Calculator3();

        //Use the Calculator object and arguments supplied to findTotal()
        //to print the total for each person
        double[] amounts = {10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0};


       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
        for (int i = 0; i < amounts.length; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            calc.findTotal(amounts[i]);
        }
    }
}
