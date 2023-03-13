package Seminars.Seminar_3;

public class Rectangle extends Figure implements Perimeter {
    private int a;
    private int b;


    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer getPerimeter() {
        return (2 * (this.a + this.b));
    }

    @Override
    public boolean check() {
        return (a > 0 && b > 0 && a < (a + 2 * b) && b < (b + 2 * a));
    }

    @Override
    public Integer squre() {
        return (this.a * this.b);
    }
}
