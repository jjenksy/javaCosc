package cs3.assignment1.assignment2;

/**
 * Created by jenksy on 9/24/17.
 * Write a Java program that reads words from a text file and displays all the words (duplicates allowed)
 in ascending alphabetical order. The words must start with a letter. The text file is passed as a command-line
 argument.
 */
public class Excercise1 {

    public static void main (String [] args){
        if(args.length<1){
            //todo check status codes
            System.exit(1);
        }
        readWords();
    }


    
    private static void readWords() {

    }
}
