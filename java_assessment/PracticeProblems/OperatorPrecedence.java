package PracticeProblems;

import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = (a + b) * c;
        int result3 = a + b - c * a / b;
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);

    }
}
