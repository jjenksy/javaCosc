package classExercises;

import java.util.Scanner;

/**
 ** COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 10/3/2016
 * LEAPYEARS
 *Write a program that displays all leap years, 10 per line, from two positive interger year periods entered by
 * the user,
 */
public class LEAPYEARS {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int noOfLeapYear = 0;//init the leapyear count
        System.out.print("Enter the starting year: ");//log to get starting year from user
        int startYear = stdin.nextInt(); // stor the input in int startYear
        System.out.print("Enter the ending year: "); //log to get ending year
        int endYear = stdin.nextInt(); // store the input in int endYear



        //iterate ove r all the years from start to end
        for (int year = startYear; year <= endYear; year++) {
            //if the year divided by 4 has no remainder then is a leapyear
            boolean isLeapYear = (year % 4 == 0);
            // if boolean is true
            if (isLeapYear) {
                //increment the leap year count
                noOfLeapYear++;
                //print the year
                System.out.print(year + " ");
                //start a new line every tenth year printed
                if (noOfLeapYear % 10 == 0) {
                    System.out.println();
                }
            }
        }

        //log the final output to the console
        System.out.print("There were "+noOfLeapYear+" leap years from "+startYear+" to "+endYear);

    }
}
