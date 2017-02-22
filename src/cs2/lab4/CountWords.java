package cs2.lab4;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * * John Jenkins
 * 02/22/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 4 Hw4
 * Due Date: Wednesday, February 22, 2017
 *  (Count words) Write a program that counts the number of words in President Abraham
 Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/Lincoln.txt.
 *
 */
public class CountWords {
    public static void main(String[] args) {


        String s = getStringFromUrl("http://cs.armstrong.edu/liang/data/Lincoln.txt");
        System.out.println("Total word count = " +  countWords(s));



    }

    /**
     * getStringFromUrl takes in a url to a text document and reads all the words
     * in from the doc and returns a string containing all the words in the
     * document
     * @param urlString the url String
     * @return the string containing all the words in the document
     */
    private static String getStringFromUrl(String urlString) {
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid url: " + ex.getMessage());
            ex.printStackTrace();
            System.exit(1);
        }

        String s = "";
        try (Scanner input = new Scanner(url.openStream())) {

            while (input.hasNext()) {
                s += input.nextLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return s;
    }

    /**
     *countWords method takes in a string containing words and
     * counts each word that does not have a length of 0
     * @param word the string to count the words of
     * @return
     */
    private static int countWords(String word) {
        //create an array of words based on a regex
        String[] words = word.split("[ ,.]", 0);
        int wordCount = 0;
        for (int i = 0; i < words.length; i++) {
            //ensures we are not counting empty space
            if (words[i].length() != 0) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
