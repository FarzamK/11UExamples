
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kathf6052
 */
public class MethodsExample {
    // void method type - perform an action
    // does not return an answer
    // sometimes called a procedure

    //inside of the round brackets - extra variable needed to run
    public void sayHello(String name) {
        System.out.println("Hello " + name);

    }
    // double return trype - needs to send double as an answer
    // sometimes called a function 

    public double areaOfRect(double length, double width) {
        // calculate area
        double answer = length * width;
        // send back the answer
        return answer;


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run my methods
        MethodsExample test = new MethodsExample();
        // create a scanner
        Scanner in = new Scanner(System.in);
        // Ask user for name 
        System.out.println("Please enter your name");
        // store their name
        String userName = in.nextLine();
        // say hello to the user
        test.sayHello(userName);

        // aask for nums
        System.out.println("Please enter the length and width of a rectangle ");
        
        double a = in.nextDouble();
        double b = in.nextDouble();
       // calculate the area 
        double area = test.areaOfRect(a, b);
        // let the user know the answer
        System.out.println("The are is " + area);

    }
}
