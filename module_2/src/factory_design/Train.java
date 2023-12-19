package factory_design;

public class Train implements MotorVehicle{
    @Override
    public void move() {
        System.out.println("Train moving!");
    }
}
