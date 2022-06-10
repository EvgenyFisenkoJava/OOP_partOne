package ru.skypro;

public class Hogwarts {
    private final String name;
    private int magic; // колдовство
    private int apparition; // трансгрессия

    public Hogwarts (String name, int magic, int apparition) {
        this.name = name;
        this.magic = magic;
        this.apparition = apparition;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }

    public String toString () {
        return "Имя: " + this.getName() + ", Колдовство: " + this.getMagic() + ", Трансгрессия: " + this.getApparition();
    }

    public void compareStudentsMagic (Hogwarts name) {
        int magicCompare = this.getMagic();
        int magicCompare2 = name.getMagic();
        if (magicCompare > magicCompare2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + name.getName());
        }
        else {
            System.out.println(name.getName() + " обладает большей мощностью магии, чем " + this.getName());
        }
    }

    public void compareStudentsApparition (Hogwarts name) {
        int apparitionCompare = this.getApparition();
        int apparitionCompare2 = name.getApparition();
        if (apparitionCompare > apparitionCompare2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + name.getName());
        }
        else {
            System.out.println(name.getName() + " обладает большей мощностью трансгрессии, чем " + this.getName());
        }
    }
}
