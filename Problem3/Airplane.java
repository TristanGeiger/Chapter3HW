package Problem3;

import Problem2.Flight;

public class Airplane implements Flight, Movement {


    private String model;

    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void fly() {

        System.out.print("I'm an airplane that relies on an engine to fly.");
    }

    public void walk(){
        System.out.println("I tax on my wheels.");
    }

    public void jump(){
        System.out.println("I cannot jump.");
    }

    public String toString() {
        return "Airplane [model=" + getModel() + ", year = " + getYearBuilt() + "]";

    }
}

