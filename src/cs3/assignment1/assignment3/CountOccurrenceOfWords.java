package cs3.assignment1.assignment3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 *  *  Instructor: Jing Zhang, PhD
 * Programming Assignment 3 Exercise1
 * Created by jenksy on 10/01/17.
 * (http://www.cs.armstrong.edu/liang/intro10e/html/CountOccurrenceOfWords.html) to display the words in
 ascending order of occurrence counts.
 (Hint: Create a class named WordOccurrence that implements the Comparable interface. The class contains two
 fields, word and count. The compareTo method compares the counts. For each pair in the hash set in Listing
 21.9, create an instance of WordOccurrence and store it in an array list. Sort the array list using the
 Collections.sort method.)
 */
public class CountOccurrenceOfWords {
    public static void main(String[] args) {
        // Set text in a string
        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";

        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();
        //list if occurances
        String[] words = text.split("[\\s+\\p{P}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                }
                else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        ArrayList<WordOccurrence> list = new ArrayList<>();
        // Display key and value for each entry
        map.forEach((k, v) -> System.out.println(k + "\t" + v));
        Collections.sort(list);
        list.forEach((word) -> System.out.println(word.getWord() + "\t" + word.getCount()));
    }
}

class WordOccurrence implements Comparable<WordOccurrence> {

    private String word;
    private int count;

    public WordOccurrence(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public int compareTo(WordOccurrence o) {
        if (o.count > count)
            return -1;
        else if (o.count < count)
            return 1;
        else
            return 0;
    }
}