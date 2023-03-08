package pro.sky;

public class Truck extends Vehicle implements MotorVehicle, Trailer{

    public Truck() {
        super();
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }
}
