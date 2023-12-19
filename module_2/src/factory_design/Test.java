package factory_design;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        MotorVehicle car = carFactory.create();
        car.move();


    }
}
