package Problem3;

import Problem2.Flight;

public class Bird implements Flight, Movement {

    private String type;

    public Bird(String type) {

        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.print("I'm a bird who flaps my wings to fly.");
    }


    public void walk(){
        System.out.println("I walk on my feet.");
    }

    public void jump(){
        System.out.println("I jump by leaping from my feet.");
    }
    public String toString(){
        return "[type = " + getType() + " ]:" ;
    }
}
