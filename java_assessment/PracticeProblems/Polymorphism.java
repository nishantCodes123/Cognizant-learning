package PracticeProblems;

public class Polymorphism {
     int add(int a, int b) { return a + b; }
     double add(double a, double b) { return a + b; }
     int add(int a, int b, int c) { return a + b + c; }
    public static void main(String[] args) {
         Polymorphism poly=new Polymorphism();
         System.out.println("The polymorphism in action:");
        System.out.println(poly.add(1, 2));
        System.out.println(poly.add(1.5, 2.5));
        System.out.println(poly.add(1, 2, 3));
    }
}
