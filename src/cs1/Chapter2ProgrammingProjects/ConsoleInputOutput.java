package cs1.Chapter2ProgrammingProjects;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 8/30/2016
 * Console Input/Output and Computation
 *******************************/
/** Created by jjenkins on 8/30/2016.
 * Chapter 3 programming project 3
 * Write a java program that reads in the radius and length of a cylinder and computes the area and the
 *volume using the following formulas:
 *Area = radius * radius * pi
 *Volume = area * length
 */
public class ConsoleInputOutput {

    public static void main(String[] args) {

        //create a Scanner object
        Scanner input = new Scanner(System.in);


        // get the user input for the radius
        System.out.print("Enter the radius of a cylinder: ");
        double radius = input.nextDouble();

        // get the user input for the length
        System.out.print("Enter the length of a cylinder: ");
        int length = input.nextInt();

        //call the methods for computing area and volume
        computeVolume(computeArea(radius),length);


    }


    /**
     *computeArea calculates, formats and prints the area
     * @param radius arg for radius
     * @return the computed area
     */
    public static double computeArea (double radius){

        //using DecimalFormat to get a more exact formatted output
        DecimalFormat df = new DecimalFormat("#.0000");
        //calculate the area
        double area = radius * radius * Math.PI;

        //format the output and print to console
        System.out.println("The area is: " + df.format(area));

        return area;


    }

    /**
     * computeVolume calculates, formats and prints the volume
     * @param area the arg for area
     * @param length the arg for length
     */
    public static void computeVolume (double area , int length){
        //using DecimalFormat to get a more exact formatted output
        DecimalFormat df = new DecimalFormat("#.0");
        //calculate the volume
        double volume = area * length;

        //format the output and print to console
        System.out.print("The volume is: " + df.format(volume));


    }
}
