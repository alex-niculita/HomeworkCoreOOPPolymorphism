package pro.sky;

public class Car extends Vehicle implements MotorVehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
        super();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

