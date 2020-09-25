package main.java.lesson6.clients;

import main.java.lesson6.processes.Cellphone;
import main.java.lesson6.processes.GeneralManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new Cellphone("iphone");
        manufacturer.launchProcess();
    }
}
