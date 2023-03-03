package Seminars.Seminar_1;

public class Bicycle extends Auto{
    public Bicycle(String model, String color, Integer weight, Integer speed) {
        super(model, color, 2,  weight, speed);
    }

    @Override
    public void drive() {
        System.out.println("Едем, едем и никак не приедем");
    }
}
