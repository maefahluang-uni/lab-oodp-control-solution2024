Lab - Object Oriented Programming
==========

Before you start
----------
The purpose of this lab is to practice Java programming on control flow


Exercise One - Boolean Expression
--------------------
Please complete the boolean expression in the methods of **BooleanExpression.java**
1.  Write a Java  boolean expression which tests whether the value of the char variable, userResponse, is equal to either 'y' or 'Y'.
   ```
   userResponse == 'y' || userResponse == 'Y'
   ```
2. Write a Java boolean expression which tests whether the value of the int variable, amount, is odd (i.e. not evenly divisible by 2).
   ```
   amount % 2 != 0
   ```
3. Write a Java boolean expression which tests whether the String variable, firstName, begins with the letter 'A'.
    ```
   firstName.startsWith("A")
    ```
4. Write a Java boolean expression which tests whether the String variable, singer, is equal to "Taylor Swift" (Hint: remember that Strings are objects, not primitive types).
   ```
   singer.equalsIgnoreCase("Taylor Swift")
   ```
5. Write a Java boolean expression which tests whether the value of the int variable yearBorn, is greater than 1978 but is not equal to 2013.
   ```
   yearBorn > 1978 && yearBorn != 2013
   ```
You can run test script TestBooleanExpression.java for testing your expression.

Exercise Two - Print Pattern
--------------------
The **PatternPrinting.java** contains a method printRowOfStarsWithFor(). Please complete this  method using for loop so that it prints a row of stars (*). Also, use while-loop in printRowOfStarsWithWhile() to do the same task. The number of starts it should print is passed via the int parameter, "howMany".
The loop must be stoped if the number of starts is more than 5.

For example, when called by: printRowOfStarsWithFor(2) or printRowOfStarsWithWhile(2); the result should be given as below

```
**
```

when called by: printRowOfStarsWithFor(10) or printRowOfStarsWithWhile(10); the result should be given as below
```
*****
```

Exercise Three - Complex Utility
---------------------
Complete the methods in ComplexUtils.java
1. Compare two names and if they are the same return "Same name", otherwise if they start with exactly the same letter return "Same first letter", otherwise return "No match".
2. Determine if the given year is a leap year, which occurs once every four years. Leap year has 366 days including February 29. please follow this [link](https://www.wikihow.com/Calculate-Leap-Years) as a guideline to check.
3. Return the given string in reverse order. For example, given 'hello' would return 'olleh'
4. Determine if the given number is a prime number. A prime number is a natural number greater than 1, which is only divisible by 1 and itself. 
5. Determine if the given string is a palindrome (case folded). You may use method to  reverse string in 3. to acommplish this.
6.Generate a space separated list of all the prime numbers from 2 to the highest prime less than or equal to the given integer. For example, given 20 as num, the method would return 2 3 5 7 11 13 17 19

Submit this lab
------------------
Don't forget to push your project to Github. Please make sure your project's classroom workflow is successfully executed. You may refer to the previous lab "Submit this lab", as a guideline for checking submission.

