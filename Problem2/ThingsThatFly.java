package Problem2;

import Problem2.Airplane;
import Problem2.Bird;
import Problem2.Flight;

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {

        ArrayList<Flight> flyingObjects = new ArrayList<>();

        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");

        flyingObjects.add(airplane);
        flyingObjects.add(eagle);
        flyingObjects.add(hummingbird);


        for (Flight flyingObject : flyingObjects) {
            System.out.println(flyingObject + ": ");
            flyingObject.fly();
        }


    }
}