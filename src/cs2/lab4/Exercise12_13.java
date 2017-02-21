package cs2.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by jjenkins on 2/21/2017.
 */
public class Exercise12_13 {
    public static void main(String[] args) {
        int characters = 0;//the int to hold the character count
        int words = 0;//the words int
        int lines = 0;//the lines int
        //determine if the command line args where entered
        if (args.length != 1) {
            System.out.println("Invalid arguments.");
            System.exit(1);
        }
        File filename = new File(args[0]);//get the file
        //make sure the file exists before we continue
        if (!filename.exists()) {
            System.out.println("The " + filename + " you entered does not exist.");
            System.exit(2);
        }


        try {
            Scanner input = new Scanner(filename);//Create a scanner to read the file
            while (input.hasNext()) {//continue as long as we have something to read
                String s = input.nextLine();
                lines++;//add to the lin count
                characters += s.length();//increment the character count
                String[] split = s.split(" ");//split the string at the whitespace

                //for each loop to itterate the array
                for (String word : split) {
                    words++;//increment the words count each time it is ran
                }

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);


    }
}
