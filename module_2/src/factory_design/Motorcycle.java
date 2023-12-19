package factory_design;

public class Motorcycle implements MotorVehicle{
    @Override
    public void move() {
        System.out.println("Bike moving!");
    }
}
