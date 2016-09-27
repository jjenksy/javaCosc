package classExercises;

import java.util.Scanner;

/**
 * Created by jjenkins on 9/16/2016.
 */
public class LoopAndSentinal {



    //pattern while loop problem
            public static void main(String[] args) {
                System.out.print("Enter the number of lines:");
                Scanner input = new Scanner(System.in);

                // get the total number of lines n.
                int n = input.nextInt();

                // Loop through the lines from 1 to n
                System.out.println("Pattern A");
                for (int i = 1; i <= n; i++) {

                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }

                // Loop through the lines from 1 to n (i=0 to n-1
                System.out.println("Pattern B");
                for (int i = 0; i < n; i++) {



                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }
                //Loop through the lines from 1 to n (i=0 to n-1)
                System.out.println("Pattern C");
                for (int i = 1; i <= n; i++) {

                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= i; j++) {
                        System.out.print(i-j + " ");
                    }
                    System.out.println();

                }



                //Loop through the lines from 1 to n
                System.out.println("Pattern D");
                for (int i = 0; i < n; i++) {
                    // Printing number increamentally from 1 to line number j
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }

            }



}
