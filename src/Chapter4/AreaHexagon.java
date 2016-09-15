package Chapter4;
import java.util.Scanner;
/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 9/15/2016
 * Console Input/Output and Computation
 *******************************/
/**
 * Created by jjenkins on 9/15/2016.
 * The area of a hexagon can be computed using the
 * following formulas (s is the length of a side): See Code
 * Write a program that prompts that user to enter the side of a hexagon and displays its area.
 */
public class AreaHexagon {

        public static void main(String [] args){
            Scanner input = new Scanner(System.in);//create a scanner obj

            //log a message to the console
            System.out.print("Enter the side:");
            //get users answer
            double s = input.nextDouble();

            //calculate the Area
            double area = (6 * Math.pow(s,2))/(4*Math.tan(Math.PI/6));
            //log the formatted result to the console
            System.out.printf("The area of a hexagon is %3.2f",area);
        }

}
