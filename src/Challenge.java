import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
* have karel make a bar graph of results in algorithm form
*
* @author Farzam Kathia
*/
public class Challenge {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       // create city and robot
       City kw = new City();
       Robot karel = new Robot(kw, 0, 1, Direction.SOUTH);


       // show things
       kw.showThingCounts(true);


       // make things
       new Thing(kw, 1, 1);
       new Thing(kw, 1, 1);
       new Thing(kw, 1, 1);

       new Thing(kw, 2, 1);
       new Thing(kw, 2, 1);

       new Thing(kw, 3, 1);
       new Thing(kw, 3, 1);
       new Thing(kw, 3, 1);
       new Thing(kw, 3, 1);

       new Thing(kw, 4, 1);
       new Thing(kw, 4, 1);
       new Thing(kw, 4, 1);
       new Thing(kw, 4, 1);
       new Thing(kw, 4, 1);


       // algorithm to make karel drop it in a bar graph formation
       while (karel.getStreet() != 5) {
           karel.move();
           while (karel.canPickThing() == true) {
               karel.pickThing();
           }
           karel.turnLeft();
           while (karel.countThingsInBackpack() > 0) {
               karel.putThing();
               karel.move();
           }
           karel.turnLeft();
           karel.turnLeft();
           while (karel.getAvenue() != 1) {
               karel.move();
           }
           karel.turnLeft();
       }







   }
}