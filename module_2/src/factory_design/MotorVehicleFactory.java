package factory_design;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        return createMotorVehicle();
    }
    protected abstract MotorVehicle createMotorVehicle();
}
