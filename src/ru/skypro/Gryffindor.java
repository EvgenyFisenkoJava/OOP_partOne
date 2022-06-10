package ru.skypro;

public class Gryffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private  int courage; // храбрость

    public Gryffindor(String name, int magic, int apparition, int nobility, int honor, int courage) {
        super(name, magic, apparition);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
}

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public void printStudent () {
        super.printStudent();
        System.out.println(", Благородство: " + getNobility() + ", Честь: " + getHonor() +
                ", Храбрость: " + getCourage());
    }

    public void compareGryffindor (Gryffindor name) {
        int sum = this.getNobility() + this.getHonor() + this.getCourage();
        int sum2 = name.getNobility() + name.getHonor() + name.getCourage();
        if (sum > sum2) {
            System.out.println(this.getName() + " лучший Гриффиндорец чем " + name.getName());
        } else {
            System.out.println(name.getName() + " лучший Гриффиндорец чем " + this.getName());
        }
    }
}
