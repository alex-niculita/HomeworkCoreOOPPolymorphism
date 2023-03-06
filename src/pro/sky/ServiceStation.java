package pro.sky;

public class ServiceStation {

    private void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        }
    }
    public void check(Bicycle bicycle) {
        check((Vehicle) bicycle);
    }

    public void check(Car car) {
        check((Vehicle) car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        check((Vehicle) truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

}
