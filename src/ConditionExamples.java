
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kathf6052
 */
public class ConditionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 2, 1, Direction.EAST);

        // put a wall up
        new Wall(kw, 2, 5, Direction.EAST);

        //put thing
        new Thing(kw, 2, 4);

        //change karels coloure
        karel.setColor(Color.MAGENTA);

        //check if front is clear
        if (karel.frontIsClear()) {
            //move forwards
            karel.move();
        } else {
            // if front is blocked, turn
            karel.turnLeft();
        }






        //move until the wall 
        while (karel.frontIsClear()) {
            //if there is something to pick up
            if (karel.canPickThing()) {
                //pick thing
                karel.pickThing();


            }

            karel.move();
            while (true) {
                karel.setColor(Color.CYAN);
                karel.setColor(Color.MAGENTA);
                karel.setColor(Color.RED);
                karel.setColor(Color.BLUE);
                karel.setColor(Color.PINK);
                karel.setColor(Color.ORANGE);
                karel.setColor(Color.GREEN);
                karel.setColor(Color.YELLOW);
                karel.setColor(Color.BLACK);
                karel.setColor(Color.WHITE);
                karel.setColor(Color.CYAN);
                
                
            }



        }




    }
}
