package ru.skypro;

public class Ravenclaw extends Hogwarts{

    private int cleverness; // ум
    private int wisdom; // мудрость
    private int creativity; // творчество

    public Ravenclaw(String name, int magic, int apparition, int cleverness, int wisdom, int creativity) {
        super(name, magic, apparition);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void printStudent() {
        System.out.println(super.toString() + ", Ум: " + getCleverness() + ", Мудрость: " + getWisdom() +
                ", Творчество: " + getCreativity());
    }

    public void compareRavenclaw (Ravenclaw name) {
        int sum = this.getCleverness() + this.getWisdom() + this.getCreativity();
        int sum2 = name.getCleverness() + name.getWisdom() + name.getCreativity();
        if (sum > sum2) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + name.getName());
        } else {
            System.out.println(name.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }
}
