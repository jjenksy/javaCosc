package Chapter5;

import java.text.DecimalFormat;

/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 10/3/2016
 * Loops
 * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds)
 * ---------------------------------------
 *  Kilograms                       Pounds
 *  ----------------------------------------
 *  1                           2.2
 *  3                           6.6
 *  5                           11.0
 *  ...                         ...
 *   197                           433.4
 *   199                           437.8
 *   ----------------------------------------
 *******************************/
public class KiloToPounds {
    //main method
    public static void main(String args[]){
        //invoke table header method
        printTableHeader();
        //invoke tableBody method
        printTableBody();
        //invoke table footer method
        printTableFooter();
    }

    /**
     * This method prints the header info. to the console
     */
    public static void printTableHeader(){
        //print the header to the console
        System.out.println("----------------------------------------");
        System.out.println(" Kilograms                       Pounds");
        System.out.println("----------------------------------------");
    }

    /**
     * this method print the table body info to the console
     */
    public static void printTableBody(){
        //create and instance of the DecimalFormat object
        DecimalFormat df = new DecimalFormat("#.0");
        //iterate over the assigned params
        //incrementing by 2
        for(int i = 1; i<=199; i+=2){
            //log the formatted data to the console
            System.out.println("   " + i+ "                           " + df.format(i*2.2));

        }

    }

    /**
     * This method prints the table footer to the console
     */
    public static void printTableFooter(){
        //print the footer
        System.out.println("----------------------------------------");
    }
}
