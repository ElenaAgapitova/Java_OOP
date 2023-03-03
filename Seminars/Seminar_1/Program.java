package Seminars.Seminar_1;

public class Program {
    /*
    2.На любом языке C++ или C# реализовать следующий набор классов, при этом должна быть выделена
    их иерархия:
	2.1.Транспортное средство
	2.2.Автомобиль
	2.3.Мотоцикл
	2.4.Грузовик
	2.5.Велосипед
    Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость
    а так же метод ехать.
    В классе Program реализовать метод который будет работать с любым наследником класса ровно
    так же как и с родителем, то есть показать значение всех его публичных свойств и вызвать метод ехать.
     */
    public static void main(String[] args) {
        Auto car_1 = new Car("Skoda", "red", 1200, 220);
        Auto moto_1 = new Moto("Java", "yellow", 800, 300);
        Auto truck_1 = new Truck("Камаз", "черный", 24, 18000, 120);
        System.out.println(car_1.getSpeed());
        System.out.println(car_1.getSpeed());
        car_1.drive();
        System.out.println(car_1.getAmountWheels());

    }
}
