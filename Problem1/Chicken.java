package Problem1;

public class Chicken extends FarmAnimal {

    private String sound;

    public Chicken(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
        this.sound = "Quack Quack";
    }


        public String toString(){
            return super.toString() + " [" + sound + "]";
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + "; 8am to 4pm";
    }


    }






