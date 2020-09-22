package main.java.lesson5;

public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("turn on the TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the TV.");
    }

    @Override
    public void connectToController() {
        System.out.println("TV has been connected to remote controller.");
    }
}