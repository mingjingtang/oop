package main.java.factoryPattern;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("the truck is starting!");
    }
}
