package cs2.lab4;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jjenkins on 2/22/2017.
 *
 * (Replace text) Listing 12.16 below, ReplaceText.java, gives a program that replaces text in
 a source file and saves the change into a new file. Revise the program to save the change into the
 original file. For example, invoking java Exercise12_16 file oldString newString replaces
 oldString in the source file with newString.

 */
public class Excercise12_16 {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
                // Create input and output files
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }


        }
    }
}
