package cs2.LectureAssignments.programmingassignment1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * * John Jenkins
 * 02/19/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Programming Assignment I
 * Created by jenksy on 2/19/17.
 * 1.	Create a MergeFiles application that merges the integers ordered from low to high in two text data files into a third text data file, maintaining the order from low to high (no post merge sorts!). For example, the two files of integers could contain:
 * File 1: 12 23 34 45 56 67 69 123 133
 * File 2: 4 5 10 20 35 44 100 130 150 160 180
 * The application should not use an array or ArrayList to temporarily store the numbers, but should merge the two files taking one element at a time from each. After MergeFiles runs for this example, the third file should contain:
 * 4 5 10 12 20 23 34 35 44 45 56 67 69 100 123 130 133 150 160 180
 * Create the two input files using a text editor with the numbers of your choice. Be sure to employ proper exception handling for the file I/O. Use at least one try-catch statement that properly handles exceptions.
 */
public class MergeFIles {

    public static void main(String[] args) {

        //creates a new Scanner object  and file to read from
        Scanner file1= null;
        Scanner file2 = null;
        try {
            //create Scanner objects to read the contents of my 2 files
            file1 = new Scanner(new FileReader("merge1.txt"));
            //creates a new Scanner object and file to read from
            file2 = new Scanner(new FileReader("merge2.txt"));
            // Opening file writer
            PrintWriter writeFile = new PrintWriter(new File("merge3.txt"));

            // reading first file and second file
            int temp1 = -1, temp2 = -1;//sentinals
            while(file1.hasNext() && file2.hasNext()){
                // if temp 1 was used get the nextInt from the file
                    if(temp1<0){
                        temp1 = file1.nextInt();
                    }
                    //if temp2 was used get the next int from the file
                    if(temp2<0){
                        temp2 = file2.nextInt();
                    }
                    //compare the inputs
                    if (temp1 <= temp2) {
                        //write the winner to the new file
                        writeFile.print(temp1 + " ");
                        temp1 = -1;


                    } else {
                        //write temp2 as the winner
                        writeFile.print(temp2 + " ");
                        temp2=-1;

                    }

            }

            //check to see if ther are any remaining in the fails and print them
            if(file1.hasNext()){
                printRemaing(file1,writeFile);
            }
            if (file2.hasNext()){
                printRemaing(file2,writeFile);
            }

            //close up shop
            file1.close();
            file2.close();
            writeFile.close();

            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }






    }

    private static void printRemaing(Scanner file, PrintWriter writeFile) {
        while (file.hasNext()){
            writeFile.print(file.nextInt() + " ");
        }
    }

}
