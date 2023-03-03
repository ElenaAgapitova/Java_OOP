package Seminars.Seminar_1;

public class Auto {
    protected String model;
    protected String color;
    protected Integer amountWheels;
    protected Integer weight;
    protected Integer speed;

    public Auto(String model, String color, Integer amountWheels, Integer weight, Integer speed) {
        this.model = model;
        this.color = color;
        this.amountWheels = amountWheels;
        this.weight = weight;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getAmountWheels() {
        return amountWheels;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getSpeed() {
        return speed;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void drive() {
        System.out.println("Транспорт едет");
    }
}
