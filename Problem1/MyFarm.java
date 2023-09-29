package Problem1;


import java.util.ArrayList;
import java.util.List;
public class MyFarm {
    public static void main(String[] args){

        List<FarmAnimal> farmAnimals = new ArrayList<>();

        Duck Donald = new Duck("Donald", "male", 3.2, 5);
        Duck Cheese = new Duck("Cheese", "female", 3.6, 5);
        Cow Molly = new Cow("Molly", "female", 1600.0, 3);
        Chicken Albert = new Chicken("Albert", "male", 1.6, 4);
        Chicken Amelia = new Chicken("Amelia", "female", 1.8, 4);
        Chicken Dixie = new Chicken("Dixie", "Female", 1.7, 4);

        farmAnimals.add(Donald);
        farmAnimals.add(Cheese);
        farmAnimals.add(Molly);
        farmAnimals.add(Albert);
        farmAnimals.add(Amelia);
        farmAnimals.add(Dixie);

        for(FarmAnimal animal : farmAnimals) {
            System.out.println(animal);
        }

        System.out.println();

        for( FarmAnimal animal : farmAnimals) {
            System.out.println(animal.feedLoadingSchedule());
        }
















    }
}
