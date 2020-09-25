package main.java.lesson6.processes;

public class Cellphone extends GeneralManufacturingProcess {
    public Cellphone(String name) {
        super(name);
    }

    @Override
    protected void assembly() {
        System.out.println("cellphone assembled.");
    }

    @Override
    protected void testing() {
        System.out.println("cellphone tested.");
    }

    @Override
    protected void packaging() {
        System.out.println("cellphone packaged.");
    }

    @Override
    protected void storage() {
        System.out.println("cellphone stored.");
    }
}
