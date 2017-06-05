package cs2.finalExam;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jenksy on 5/9/17.
 * Write a Java program that will open a text file named "input.txt" (if it exists) and count the number of characters and lines in the file. Write the counts as output similar to the display shown below.

 File input.txt contains 246 characters in 17 lines.
 */
public class CountCharsAndLines {

    public static void countCharsAndLines(){

        ArrayList<String> lineArray = new ArrayList<>();
        try {
             Scanner in = new Scanner(new File("input.txt"));

             while (in.hasNext()){
                 lineArray.add(in.nextLine());
             }

            int counter = 0;
             //iterate and count lines
            for (String s : lineArray) {
                for( int i=0; i<s.length(); i++ ) {
                    if( s.charAt(i) != ' ' ) {
                        counter++;
                    }
                }
            }
             System.out.println("File input.txt contains "+counter+" characters in "+lineArray.size()+" lines.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        CountCharsAndLines.countCharsAndLines();
    }
}
