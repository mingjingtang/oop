package main.java.lesson5;

public class RemoteControl {
    private static final RemoteControl controller = new RemoteControl();
    private Device curDevice;

    private RemoteControl(){
        System.out.println("new controller has been created.");
    };

    public static RemoteControl getController(){
       return controller;
    }

    public void turnOnDevice(Device curDevice){
       curDevice.turnOn();
    }

    public void turnOffDevice(Device curDevice){
        curDevice.turnOff();
    }
}
