package classExercises;

import java.util.Scanner;

/**
 * Created by jjenkins on 9/29/2016.
 *Write a program that displays all leap years, 10 per line, from two positive interger year periods entered by
 * the user,
 */
public class LEAPYEARS {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int noOfLeapYear = 0;
        System.out.print("Enter the starting year: ");
        int startYear = stdin.nextInt();
        System.out.print("Enter the ending year: ");
        int endYear = stdin.nextInt();


        //In general terms the algorithm for calculating a leap year is as follows... A year will be a leap year if it is divisible by 4 but not by 100.
        // If a year is divisible by 4 and by 100, it is not a leap year unless it is also divisible by 400.
        for (int year = startYear; year <= endYear; year++) {
            boolean isLeapYear = (year % 4 == 0);

            if (isLeapYear) {
                noOfLeapYear++;
                System.out.print(year + " ");
                if (noOfLeapYear % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.print("There were "+noOfLeapYear+" leap years from "+startYear+" to "+endYear);

    }
}
