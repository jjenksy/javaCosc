package cs2.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *  John Jenkins
 * 02/22/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 4 Hw4
 * Due Date: Wednesday, February 22, 2017
 *
 * (Replace text) Listing 12.16 below, ReplaceText.java, gives a program that replaces text in
 a source file and saves the change into a new file. Revise the program to save the change into the
 original file. For example, invoking java Exercise12_16 file oldString newString replaces
 oldString in the source file with newString.
 * Excercise12_16 takes 3 command line arguments to run.
 * arg 1 = the name of the file
 * arg 2 = the word to replace
 * arg 3 = the word to replace it with
 */
public class Excercise12_16 {
    public static void main(String[] args) {

        //test to make sure we have 3 arguments
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File filename = new File(args[0]);
        if (!filename.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        String old = args[1];//get the value of the string to replace
        String newS = args[2];//get the value of the new String to replace it with
        String buffer = "";
        try {
            //read the file
            Scanner input = new Scanner(filename);
            while (input.hasNext()) {
                buffer += input.nextLine();
                buffer += "\n";
            }
            input.close();//close the input
            System.out.println("Old file: ");
            System.out.println(buffer);//print the current contents of the file
            buffer = buffer.replaceAll(old, newS);//using the String objects replaceAll method to replace the oldString with the new
            PrintWriter out = new PrintWriter(filename);
            out.write(buffer);//write the contents back to the file
            out.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Updated file:");
        System.out.println(buffer);

    }
}
