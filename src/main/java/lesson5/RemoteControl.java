package main.java.lesson5;

public class RemoteControl {
    private static final RemoteControl CONTROLLER = new RemoteControl();
    private Device curDevice;

    private RemoteControl(){
        System.out.println("new controller has been created.");
    };

    public static RemoteControl getController(){
       return CONTROLLER;
    }

    public void connectToDevice(Device device){
        this.curDevice = device;
        System.out.println("controller have been connected to the " + device);
    }

    public void turnOnDevice(Device curDevice){
       curDevice.turnOn();
    }

    public void turnOffDevice(Device curDevice){
        curDevice.turnOff();
    }
}
