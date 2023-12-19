package factory_design;

public class Car implements MotorVehicle{
    @Override
    public void move() {
        System.out.println("Car moving!");
    }
}
