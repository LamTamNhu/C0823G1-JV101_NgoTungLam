package factory_design;

public class TrainFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Train();
    }
}
