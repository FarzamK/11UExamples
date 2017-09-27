/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class TestA2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 0, 0, Direction.NORTH);

        //change karels color
        karel.setColor(Color.YELLOW);
        
        //Create a castle 
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.EAST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.WEST);
        new Wall (kw, 3, 2, Direction.WEST);
        new Wall (kw, 4, 1, Direction.NORTH);
        new Wall (kw, 4, 1, Direction.EAST);
        new Wall (kw, 4, 1, Direction.WEST);
        new Wall (kw, 4, 1, Direction.SOUTH);
        new Wall (kw, 1, 4, Direction.EAST);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.WEST);
        new Wall (kw, 1, 4, Direction.SOUTH);
        new Wall (kw, 4, 4, Direction.NORTH);
        new Wall (kw, 4, 4, Direction.EAST);
        new Wall (kw, 4, 4, Direction.SOUTH);
        new Wall (kw, 4, 4, Direction.WEST);
        new Wall (kw, 2, 2, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.EAST);
        new Wall (kw, 3, 3, Direction.EAST);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
       
        while(true){
            karel.turnLeft();
            karel.setColor(Color.YELLOW);
            karel.turnLeft();
            karel.setColor(Color.BLUE);
            karel.turnLeft();
            karel.setColor(Color.RED);
            karel.move();
            karel.setColor(Color.PINK);
            karel.move();
            karel.setColor(Color.ORANGE);
            karel.turnLeft();
            karel.setColor(Color.BLUE);
            karel.turnLeft();
            karel.setColor(Color.CYAN);
            karel.turnLeft();
            karel.setColor(Color.GREEN);
            karel.move();
            karel.setColor(Color.YELLOW);
            karel.turnLeft();
            karel.setColor(Color.MAGENTA);
            karel.move();
            karel.setColor(Color.RED);
            karel.turnLeft();
            karel.setColor(Color.ORANGE);
            karel.move();
            karel.setColor(Color.BLUE);
            karel.turnLeft();
            karel.setColor(Color.YELLOW);
            karel.turnLeft();
            karel.setColor(Color.CYAN);
            karel.turnLeft();
            karel.setColor(Color.MAGENTA);
            karel.move();
            karel.setColor(Color.GREEN);
            karel.move();
            karel.setColor(Color.ORANGE);
            
        }
        
        
        
    }
}
