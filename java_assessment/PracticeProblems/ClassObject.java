package PracticeProblems;

class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make; this.model = model; this.year = year;
    }
    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 2020);
        Car c2 = new Car("Honda", "Civic", 2019);
        c1.displayDetails();
        c2.displayDetails();
    }
}
