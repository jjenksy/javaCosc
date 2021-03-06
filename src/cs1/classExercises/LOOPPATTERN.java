package cs1.classExercises;

import java.util.Scanner;

/**
 * /**
 ** COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 10/2/2016
 * LOOPPATTERN Create the pattern
 */
public class LOOPPATTERN {

    //pattern while loop problem
            public static void main(String[] args) {
                //ask user for input
                System.out.print("Enter an integer to be a limit of the pattern:");
                Scanner stdin = new Scanner(System.in);//create a scanner obj

                // get the total number of lines n.
                int n = stdin.nextInt();

                // Loop through the lines from 1 to n
                System.out.println("Pattern A:");
                for (int i = 1; i <= n; i++) {

                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }
                System.out.println();

                // Loop through the lines from 1 to n (i=0 to n-1
                System.out.println("Pattern B:");
                for (int i = 0; i < n; i++) {

                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }

                System.out.println();
                //Loop through the lines from 1 to n (i=0 to n-1)
                System.out.println("Pattern C:");
                for (int i = 1; i <= n; i++) {

                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i - j+1 + " ");
                    }
                    System.out.println();

                }

                System.out.println();

                //Loop through the lines from 1 to n
                System.out.println("Pattern D:");
                for (int i = 0; i < n; i++) {
                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }

            }



}
