package main.java.lesson5;

public class Person {
    public static void main(String[] args) {
        Projector projector = new Projector();
        RemoteControl remoteControl = RemoteControl.getController();
        projector.connectToController();

        remoteControl.turnOnDevice(projector);
        remoteControl.turnOffDevice(projector);
    }
}
