package Seminars.Seminar_1;

public class Moto extends Auto {


    public Moto(String model, String color, Integer weight, Integer speed) {
        super(model, color, 2, weight, speed);
    }

    @Override
    public void drive() {
        System.out.println("Врум врум, вжик вжик");
    }




}

