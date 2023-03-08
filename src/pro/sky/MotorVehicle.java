package pro.sky;

public interface MotorVehicle {
    default void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

}
