package Seminars.Seminar_2;

public class Middle extends Pupils implements Play, Smoke{
    public Middle(String firstName, String lastName, String birthDay, String className) {
        super(firstName, lastName, birthDay, className);
    }

    @Override
    public void learn() {
        System.out.println("Я ненавижу учиться!");
    }

    public void play(){
        System.out.println("Я играю в Minecraft");
    }

    public void smoke(){
        System.out.println("Я начинаю курить!");
    }
}
