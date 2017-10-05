
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kathf6052
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // say hello
//        System.out.println("Hello world!");
//        System.out.print("Hello");
//        System.out.print("World \n");
        System.out.println("Please enter your name");
        
        // Create a Scanner for input
        Scanner input = new Scanner(System.in);
        

        // get name variable
        String firstName = input.nextLine();

        // output the vriable to the screen
        System.out.println("Hello " + firstName);
        
        // ask user to put their year in
        System.out.println("Please enter the year you were born");
        
        // get the year
        int birthYear = input.nextInt();
        
        while(birthYear > 2017){
            System.out.println("I don't think so BUD. Try again");
            birthYear = input.nextInt();
        }
        
        // calculate age
        int age = 2017 - birthYear;
        
        System.out.println(firstName + " , You are " + age + " years old ");
        
        // for loop to count down from 10
        for (int i = 10; i > 0; i = i - 1){
            //output the value in variable i
            System.out.println(i);
            
            
        }
        
        }   
        
   
}
