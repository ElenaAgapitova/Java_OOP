package Seminars.Seminar_1;

public class Car extends Auto{

    public Car(String model, String color, Integer weight, Integer speed) {
       super(model, color, 4,  weight, speed);

    }

    @Override
    public void drive() {
        System.out.println("Колеса крутятся, машина едет:)");
    }


}
