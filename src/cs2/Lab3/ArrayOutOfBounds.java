package cs2.Lab3;

import java.util.Scanner;

/**
 * John Jenkins
 * 02/13/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 3 Hw3
 * Due Date: Tuesday, February 14, 2017
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
  Creates an array with 100 randomly chosen integers.
  Prompts the user to enter the index of the array. Then display the corresponding element
 value. If the specified index is out of bounds, display the message Out of Bounds.
 */
public class ArrayOutOfBounds {
    public static void main(String[] args) {

        // creating an array with 100 random integers
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            //setting each index of the array to a random numer between 0-100
            array[i] = (int) (Math.random() * 100);
        }
        //create a scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the array: ");//ask the user for input
        //wrap it up in a try catch in order to capture the exception for array Index out of bounds
        try {
            int index = input.nextInt();//the input
            System.out.println("Array index[" + index + "] = " + array[index]);//prints out the value at the input index
        } catch (IndexOutOfBoundsException ex) {//throws an exception if the requested index is out of bounds
            System.out.println("Out of Bounds for index " + ex.getLocalizedMessage());//log out of bounds and the exception to the console
        } catch (Exception ex) {//throw an exception if bad input
            System.out.println("Input is invalid");//log to console the input is bad
        }
    }
}
