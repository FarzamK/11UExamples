
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
 *Demonstrate how to use the Robot
 * @author kathf6052
 */
public class RobotExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called England 
        City kitchener = new City();
        
        //create a robot
        Robot karel = new Robot(kitchener, 3, 2, Direction.EAST);
        //create a second robot
        Robot tina = new Robot(kitchener, 3, 5, Direction.WEST);
        //create bob
        Robot bob = new Robot(kitchener, 1, 3, Direction.SOUTH);
        //create a wall
        new Wall(kitchener, 3, 2, Direction.NORTH);
        //create a thing
        new Thing(kitchener, 3, 3);  
        
        
        
        
        //change tina's colour
        tina.setColor(Color.CYAN);
        //change karel's colour
        karel.setColor(Color.MAGENTA);
        //change bob's colour
        bob.setColor(Color.YELLOW);
        
        //get karel to move 
        karel.move();
        //have karel to pick thing 
        karel.pickThing();
        karel.move();
        //have karel turn left
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        //make karel drop thing
        karel.putThing();
        
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.pickThing();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.move();
               
               

       
        
        
        
     
    }
}
