package classExercises;

import java.util.Scanner;

/**
 * Created by jjenkins on 8/30/2016.
 */
public class FeetToMetersChapter2 {

    public static void main (String[] args){

        // Create constant value
               final double METERS = 0.305;
        //create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double x = input.nextDouble();

        //feet to meters
        double y = x * METERS;

//      y = ((int)(y * 10000) / 10000.0);
        //result
        System.out.print(x + " feet is " + y + " meters");
    }
}
