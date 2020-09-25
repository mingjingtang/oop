package main.java.lesson6.processes;

public class Computer extends GeneralManufacturingProcess {
    public Computer(String name) {
        super(name);
    }

    @Override
    public void assembly() {
        System.out.println("Assembly the computer.");
    }

    @Override
    public void testing() {
        System.out.println("Testing the computer system.");
    }

    @Override
    public void packaging() {
        System.out.println("Packaging the computer.");
    }

    @Override
    public void storage() {
        System.out.println("storage the computer.");
    }
}
