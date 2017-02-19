package cs1.chapter7Arrays;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * COSC 1173 Programming Lab
 * Name: John Jenkins
 *Data: 10/28/2016
 * Programming Question: Reverse Order
 *Write a program that reads ten integers into an array; define another array
 *to save those ten numbers in the reverse order. Display the original array
 *and new array. Then define two separate methods to compute the
 *maximum number and minimum number of the array.
 *Sample Run:
 *Please enter 10 numbers: 1 3 5 8 2 -7 6 100 34 20
 *The new array is: 20 34 100 6 -7 2 8 5 3 1
 *The maximum is: 100
 *The minimum is: -7
 *Bonus:
 *Determine how many numbers are above or equal to the average and how
 *many numbers are below the average.
 */
public class ReverseOrder {
    public static void main (String args []) {
        //create a scanner object
        Scanner input = new Scanner(System.in);
        //create an output object
        PrintStream output = new PrintStream(System.out);
        reverseOrder(input ,output);




    }

    /**
     * This method takes your input and output objects and asks the user for the input using dependency injection
     * @param input the input object
     * @param output the printStream output object
     */
    public static void reverseOrder(Scanner input, PrintStream output){
        int [] initArray = new int [10];
        output.println("Please enter 10 numbers: ");

        for (int i = 0; i <initArray.length; i++) {

            initArray[i] = input.nextInt();
        }

        printReverseArray(initArray, output);
        output.println();
        output.println("The maximum is: "+ max(initArray));
        output.println("The minimum is: " + min(initArray));
        compareToAverage(initArray,output);


    }


    /**
     * This method loops through an array and returns the largest element
     * @param initArray the array to iterate though
     * @return the largest int in  the array
     */
    public static int max(int[] initArray){
        //init the first variable
        int largest = initArray[0];
        //loop through the array
        for (int elem:initArray) {
            //if largest is < the current elem
            if(largest < elem){
                //the largest = the current elem
                largest = elem;
            }
        }
        //return the final largest value
        return largest;
    }


    /**
     *  This method loops through an array and returns the smallest element
     * @param initArray the array to iterate though
     * @return the smallest int in the array
     */
    public static int min(int[] initArray){
        //init the first variable
        int smallest = initArray[0];
        //loop through the array
        for (int elem:initArray) {
            //if smallest is > the current elem
            if(smallest > elem){
                // set smallest to the value of elem
                smallest = elem;
            }
        }
        //return the smallest value
        return smallest;
    }


    /**
     * This method takes in and int array prints a reverse array
     * @param initArray the array to reverse
     */
    public static void printReverseArray(int[] initArray , PrintStream output){
        //set the new array to the length of the current arg
        int[] reveseArray = new int[initArray.length];
        //create a start point for my reverseArray
        int start = initArray.length-1;

        //iterate through the array
        for (int elem:initArray) {
            //start at the end of the reverseArray
            reveseArray[start] = elem;
            //decrement the var to move down the array
            start--;
        }
        output.print("The new array is: ");
        //itterat through the reverse array
        for (int reverseElem:reveseArray) {
            //log the value to the console and add a space for readability
                output.print(reverseElem+" ");
        }
    }

    /// Bonus method----------------------------------------------------------------------

    /**
     * Calculate the average of the array of ints
     * @param initArray the array  of ints
     * @return the calculated average
     */
    public static int average(int [] initArray){
        //the varible that will hold the added together elems
        int added = 0;
        //iterate thought the array
        for (int elem:initArray) {
            //add all the elems together
            added += elem;
        }

        //return the average
        return added/initArray.length;
    }

    /**
     * Run the comparison to the average and log it to the stdout
     * @param initArray the initial array
     * @param output the printstream output
     */
    public static void compareToAverage(int[] initArray, PrintStream output){
        int belowAverage = 0, aboveOrEqualAverage = 0, average = average(initArray);

        for (int elem:initArray) {
            if(elem>=average){
                aboveOrEqualAverage ++;
            }else{
                belowAverage++;

            }
        }

        output.println("The average is: " + average);
        output.println("The amount of numbers that are above or equal to the average: " +aboveOrEqualAverage);
        output.println("The amount of numbers that are below the average: " +belowAverage);
    }






}
