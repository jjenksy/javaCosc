package cs2.lab9;

import java.util.Scanner;

/**
 * John Jenkins
 * 04/16/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 9 Hw9
 * Due Date: Moday, April 17, 2017
 * Created by jenksy on 4/14/17.
 * (Find the number of uppercase letters in an array) Write a recursive method to return the number
 * of uppercase letters in an array of characters. You need to define the following two methods.
 * The second one is a recursive helper method.
 * public static int count(char[] chars)
 * public static int count(char[] chars, int high)
 * Write a test program that prompts the user to enter a list of
 * characters in one line and displays the number of uppercase letters in the list.
 */
public class CountUppercase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lsit of characters in one line:  ");
        String s = input.nextLine();

        System.out.println("The number of uppercase characters in the list: " + count(s.toCharArray()));
    }


    public static int count(char[] chars) {

        return count(chars, chars.length - 1);
    }

    public static int count(char[] chars, int high) {

        int count = Character.isUpperCase(chars[high]) ? 1 : 0;
        if (high == 0){
            return count;//base case
        } else {
            return count + count(chars, high - 1);//recursive

        }

    }
}
