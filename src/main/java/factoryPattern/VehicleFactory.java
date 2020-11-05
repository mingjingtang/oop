package main.java.factoryPattern;

public class VehicleFactory {
    VehicleType vehicleType;

    public Vehicle getVehicle(VehicleType vehicleType){
        this.vehicleType = vehicleType;
        switch (vehicleType){
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();
            default:
                return null;
        }
    }
}
