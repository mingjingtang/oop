package main.java.lesson5;

public class Projector implements Device {
    @Override
    public void turnOn() {
        System.out.println("turn on the projector.");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the projector.");
    }
}
