package cs3.assignment1.assignment2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jenksy on 9/24/17.
 * Write a Java program that reads words from a text file and displays all the words (duplicates allowed)
 in ascending alphabetical order. The words must start with a letter. The text file is passed as a command-line
 argument.
 */
public class Excercise1 {

    public static void main (String [] args){
        if(args.length<1){
            System.exit(1);
        }
        readWords(args[0]);
    }


    
    private static void readWords(String fileName) {

        //create a Stream to retrieve the file contents
        Stream<String> fileContents = null;
            try {
                //get the contents of the files
                fileContents = Files.lines(Paths.get(fileName));
            } catch (IOException e){
                System.out.println(e.getMessage());
            }

        List<String> noNumbers = fileContents.filter(line-> getValidWords(line)).collect(Collectors.toList());

        System.out.println(noNumbers);
    }

    public static Boolean getValidWords(String val) {
        //todo implement check
        return false;
    }
}
