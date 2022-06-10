package ru.skypro;
import ru.skypro.Gryffindor;

    public class Main {

        public static void main(String[] args) {
            // write your code here
            Gryffindor garry = new Gryffindor("Гарри Поттер", 90, 99, 80, 55, 76);
            Gryffindor hermiona = new Gryffindor("Гермиона Грейнджер", 95, 82, 78, 60, 68);
            Gryffindor ron = new Gryffindor("Рон Уизли", 79, 52, 38, 44, 86);

            Hufflepuff zakharia = new Hufflepuff("Захария Смит", 87, 54, 42, 74, 37);
            Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 67, 88, 61, 59, 84);
            Hufflepuff jastin = new Hufflepuff("Джастин Финч-Флетчли", 65, 76, 32, 90, 22);

            Ravenclaw chzhou = new Ravenclaw("Чжоу Чанг", 55, 76, 28, 49, 93);
            Ravenclaw padma = new Ravenclaw("Падма Патил", 49, 84, 68, 39, 54);
            Ravenclaw marcus = new Ravenclaw("Маркус Белби", 19, 43, 56, 89, 99);

            Slytherin drako = new Slytherin("Драко Малфой", 66, 39, 63, 59, 42, 24, 68);
            Slytherin graham = new Slytherin("Грэхем Монтегю", 41, 95, 10, 53, 81, 92, 49);
            Slytherin gregory = new Slytherin("Грегори Гойл", 97, 51, 9, 85, 92, 77, 20);

            graham.printStudent();
            garry.compareStudentsMagic(gregory);
            marcus.compareStudentsApparition(jastin);
            garry.compareGryffindor(ron);
            cedric.compareHufflepuff(zakharia);
            chzhou.compareRavenclaw(marcus);
            drako.compareSlytherin(gregory);
    }

}
