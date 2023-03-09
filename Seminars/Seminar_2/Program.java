package Seminars.Seminar_2;

public class Program {
  // На языке программирования Java создать следующую иерархию школьников:
    //1. Младшеклассник, у которого реализовать следующие методы:
    //1.1 Учиться, выводящий на экран фразу "Я люблю учиться"
    //1.2.  Играть, выводящий на экран фразу "Я играю в игрушки"
    //1.3. Ходить в продлёнку, выводящий на экран фразу "Я хожу в продлёнку"
    //2. Ученик средней школы, у которого реализовать следующие методы:
    //2.1 Учиться, выводящий на экран фразу "Я ненавижу учиться"
    //2.2. Играть, выводящий на экран фразу "Я играю в Minecraft"
    //2.3. Курить, выводящий на экран фразу "Я начинаю курить"
    //3. Старшеклассник, у которого реализовать следующие методы:
    //3.1. Учиться, выводящий на экран фразу "Я должен учиться"
    //3.2. Курить, выводящий на экран фразу "Я бросаю курить"
    //3.3.  Влюбляться, выводящий на экран фразу "Я ищу любовь"
    //В классе Program реализовать метод, вызывающий все метода переданного объекта-школьника,
    // а в методе main создать массив школьников, и для каждого элемента массива вызывать указанный
    // метод класса Program

    public static void main(String[] args) {
        Pupils junior_1 = new Junior("Иван", "Иванов", "11.12.2014", "2A");
        Pupils middle_1 = new Middle("Петр", "Петров", "03.07.2009", "7Б");
        Pupils senior_1 = new SeniorPupil("Максим", "Агапитов",
                "05.09.2006", "10A");
        Pupils[] pupils = {junior_1, middle_1, senior_1};
        showAll(pupils);
    }

    static void showAll(Pupils[] pupils) {
        for (Pupils elem: pupils) {
            System.out.println(elem.getClass().getSimpleName());
            elem.learn();
            if (elem instanceof Play) ((Play) elem).play();
            if (elem instanceof Smoke) ((Smoke) elem).smoke();
            if (elem instanceof Love) ((Love) elem).love();
            if (elem instanceof GoExtension) ((GoExtension) elem).goExtension();
            System.out.println();
        }
    }
}
