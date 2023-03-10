package pro.sky;

public class Car extends Vehicle implements MotorVehicle{

    public Car() {
        super();
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}

