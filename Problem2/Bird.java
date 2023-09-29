package Problem2;

public class Bird implements Flight{

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

    public String toString(){
       return "[type = " + getType() + " ]:" ;
    }

    @Override
    public void fly() {
        System.out.print("I'm a bird who flaps my wings to fly.");
    }
}
