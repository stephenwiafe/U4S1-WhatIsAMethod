# U4S1 - What is A Method

* Part 1 Oracle - Foundations 4.1

## Part 1

### Exercise 1

* Open Tip01.java file in the project `lab.tip.tip01`
* This is what everyone owes before tax (5%) and tip (15%)

| Col 1          | Col 2               |
|----------------|---------------------|
| Person 1: $ 10 | Person 5 $7         |
| Person 2: $ 12 | Person 6 $15 (Alex) |
| Person 3: $ 9  | Person 7 $11        |
| Person 4: $ 8  | Person 8 $30        |

* Your program should produce the following output :

```
person1: $12.0
person2: $14.4
person3: $10.8
person4: $9.6
person5: $8.4
person6: $18.0
person7: $13.2
person8: $36.0
```

### Exercise 2

#### Part 1

* Open the following files in the package `labs.calc2`
  * CalculatorTest2.java 
  * Calculator2.java
* Complete the findTotal method which should:
  * Calculate a total based on the tax, tip, and originalPrice fileds
  * Print a person's total

#### Part 2
* From the main method:
  * Instantiate a `Calculator2` object named `calc`
  * Access this objects fields and methods to print the total for each person at the birthday party.
* Change tip and tax if you prefer different values.

### Exercise 3

#### Part 1

* Open the following files in the package `labs.calc3`
  * CalculatorTest3.java
  * Calculator3.java
* From the main method:
  * Use a Calculator3 object instance and supply arguments to
    findTotal() to print the total for each person 
  * **Hint**: Observe the findTotal() method in the Calculator class to
    figure out how many arguments this method accepts

#### Part 2

* Who does each total belong to? 
* Modify the findTotal() method to accept an additional
  * String name argument 
* Concatenate the print statement to include name 
* Observe your IDE’s complaint in the main method and
revise your findTotal() method calls

### Exercise 4

#### Part 1

* Open the following files in the package `labs.calc4`
* Find and print the entire table’s total, including tax and
  tip 
  * You'll need to edit findTotal() so that it returns its calculated
    value

#### Part 2

* Person8 forgot their wallet 
* And Alex’s meal was meant to be a birthday present 
* Modify findTotal() so that the cost of their meals are shared equally with the rest of the party 
* Recalculate the entire table’s total 
* This number shouldn’t have changed






