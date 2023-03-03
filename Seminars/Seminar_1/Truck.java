package Seminars.Seminar_1;

public class Truck extends Auto {
    public Truck(String model, String color,Integer amountWheels, Integer weight, Integer speed) {
        super(model, color, amountWheels, weight, speed);
    }

    @Override
    public void drive() {
        System.out.println("Вжжжжжжж");
    }
}
