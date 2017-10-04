/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author kathf6052
 */
public class A3Q4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        // put a robot in the city
        Robot karel = new Robot(kw, 3, 3, Direction.SOUTH);

        //change karels color
        karel.setColor(Color.MAGENTA);

        //create 4 sets of squares

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);

        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);

        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);

        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);

        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);

        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);

        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 5, 1, Direction.WEST);

        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);

        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);

        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);

        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 5, 4, Direction.WEST);

        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.SOUTH);

        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);

        //for loops to go around the square
        for (int firstCounter = 0; firstCounter < 3; firstCounter = firstCounter + 1) {
            //make karel go around square 
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            // once the first for loop has executed 
            if (firstCounter == 2) {
                for (int secondCounter = 0; secondCounter < 3; secondCounter = secondCounter + 1) {
                    karel.move();
                    karel.move();
                    karel.move();
                    for (int thirdCounter = 0; thirdCounter < 3; thirdCounter = thirdCounter + 1) {
                        karel.move();
                        karel.move();
                        karel.move();
                        karel.turnLeft();

                    }



                }
            }



        }
        karel.move();
        karel.move();
        karel.move();





    }
}
