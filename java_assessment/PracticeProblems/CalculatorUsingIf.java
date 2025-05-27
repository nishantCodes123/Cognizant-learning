package PracticeProblems;

import java.util.Scanner;

public class CalculatorUsingIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();


        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();


        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;


        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }


    }
}
