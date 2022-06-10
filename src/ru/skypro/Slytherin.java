package ru.skypro;

public class Slytherin extends Hogwarts{

    private int cunning; // хитрость
    private int decisiveness; // решительность
    private int ambition; // амбициозность
    private int ingenuity; // находчивость
    private int powerLust; // жажда власти

    public Slytherin(String name,int magic,int apparition,int cunning,int decisiveness,int ambition,int ingenuity,int powerLust) {
        super(name, magic, apparition);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    @Override
    public void printStudent() {
        super.printStudent();
        System.out.println(", Хитрость: " + getCunning() + ", Решительность: " + getDecisiveness() +
                ", Амбициозность: " + getAmbition() + ", Находчивость: " + getIngenuity() +
                ", Жажда власти: " + getPowerLust());
    }

    public void compareSlytherin (Slytherin name) {
        int sum = this.getCunning() + this.getDecisiveness() + this.getAmbition() + this.getIngenuity() + this.getPowerLust();
        int sum2 = name.getCunning() + name.getDecisiveness() + name.getAmbition()+ name.getIngenuity() + name.getPowerLust();
        if (sum > sum2) {
            System.out.println(this.getName() + " лучший Пуффендуец чем " + name.getName());
        } else {
            System.out.println(name.getName() + " лучший Пуффендуец чем " + this.getName());
        }
    }
}
