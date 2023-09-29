package Problem3;

import Problem3.Airplane;
import Problem3.Bird;
import Problem3.Flight;

import java.util.ArrayList;

public class ThingsThatMove {

        public static void main(String[] args) {


            Movement[] movingObjects = new Movement[3];


            Airplane airplane = new Airplane("Boeing 747", 2016);
            movingObjects[0] = airplane;


            Bird eagle = new Bird("Eagle");
            Bird hummingbird = new Bird("Hummingbird");
            movingObjects[1] = eagle;
            movingObjects[2] = hummingbird;


            for (Movement movingObject : movingObjects) {
                System.out.println(movingObject + ": ");
                movingObject.fly();
                movingObject.walk();
                movingObject.jump();
                System.out.println();
            }


        }
    }

