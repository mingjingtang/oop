package main.java.factoryPattern;

public class Car implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("the car is starting!");
    }
}
