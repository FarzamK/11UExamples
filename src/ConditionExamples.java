
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

    private static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City england = new City();
        Robot karel = new Robot(england, 0, 0, Direction.SOUTH);
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

            } else {
                //if karel cant pick thing, move
            }


        }



    }
}
