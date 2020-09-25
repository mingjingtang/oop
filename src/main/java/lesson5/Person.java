package main.java.lesson5;

public class Person {
    public static void main(String[] args) {
        Projector projector = new Projector();
        TV tv = new TV();

        RemoteControl remoteControl = RemoteControl.getController();

        remoteControl.connectToDevice(projector);
        remoteControl.turnOnDevice(projector);
        remoteControl.turnOffDevice(projector);
        remoteControl.connectToDevice(tv);
        remoteControl.turnOnDevice(tv);
        remoteControl.turnOffDevice(tv);
    }
}
