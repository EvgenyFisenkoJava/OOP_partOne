package ru.skypro;

public class Hufflepuff extends Hogwarts{
    private int diligence; // трудолюбие
    private int fidelity; // верность
    private int honesty; // честность

    public Hufflepuff(String name, int magic, int apparition, int diligence, int fidelity, int honesty) {
        super(name, magic, apparition);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printStudent() {
        System.out.println(super.toString() + ", Трудолюбие:" + getDiligence() + ", Верность: " + getFidelity() +
                ", Честность: " + getHonesty());
    }

    public void compareHufflepuff (Hufflepuff name) {
        int sum = this.getDiligence() + this.getFidelity() + this.getHonesty();
        int sum2 = name.getDiligence() + name.getFidelity() + name.getHonesty();
        if (sum > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + name.getName());
        } else {
            System.out.println(name.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}
