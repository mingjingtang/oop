package main.java.lesson5;

public class SurroundSoundSystem implements Device {
    @Override
    public void turnOn() {
        System.out.println("turn on the surroundSoundSystem.");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the surroundSoundSystem.");
    }
}
