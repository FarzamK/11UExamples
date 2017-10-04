
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kathf6052
 */
public class VariableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 1, 1, Direction.EAST);
        
        //change karels color
        karel.setColor(Color.CYAN);
        
        // create a move counting variable
        int moveCounter = 0;
        //continue when counter is less than 10
        while(moveCounter < 10){
            karel.move();
            //add 1 to move counter
            moveCounter = moveCounter +1;
        }
        karel.turnLeft();
        karel.turnLeft();
        
        // counted for loop
        for (int count = 0; count < 10; count = count + 1){
            //move karel
            karel.move();
        }
            

    }
}
