package main.java.builderPattern;

public class orderVehicle {
    public static void main(String[] args) {
        Vehicle newCar = new Vehicle.Builder().price(10300.76).type("car").make("Honda").horsePower(150)
                .model("Accord").color("red").door(4).build();
        System.out.println(newCar.toString());
    }
}
