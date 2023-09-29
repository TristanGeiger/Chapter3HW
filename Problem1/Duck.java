package Problem1;

public class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight,int age) {
        super(name, gender, weight, age);
        this.sound = "Quack Quack";

    }

    public String toString() {
        return super.toString() + " [" + sound + "]";
    }
    public String feedLoadingSchedule(){
        return getName() + "; 8am to 4pm";
    }
}
