package PracticeProblems;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = 10.5;
        int i = (int) d;
        System.out.println("Original double: " + d);
        System.out.println("After casting to int: " + i);
    }
}

