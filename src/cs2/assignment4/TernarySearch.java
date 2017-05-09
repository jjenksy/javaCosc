package cs2.assignment4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  * *John Jenkins
 * 05/09/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Created by johnjenkins on 5/4/17.
 * Problem 1
 * Write a ternarySearch() method using recursion. A ternary search is similar to a binary search,
 * but it divides the array into three pieces rather than two. A ternary search finds the points
 * that divide the array into three roughly equal pieces, and then uses these points to determine where to search for the key.
 * The binary search method is shown in Listing 18.6 on page 716 of your textbook.
 * Create a main method that prompts the user for the size of the array and generates
 * it randomly. It should also prompt the user for the key (number that is to be searched for).
 * Then display the array, sort it (which is a pre-requisite for a ternary search) using either the
 * Java Sort method (java.util.arrays.Sort) or one you’ve written, search for the key, and show where it is found (or not found).
 *
 * Modify the ternary search method implemented in problem #1 using a generic type. The search method looks like the following:
 * public static <E extends Comparable<E>> int ternarySearch(E[] list, E key)
 * Since the type extends Comparable, be sure to make comparisons using the compareTo method or equals method.

 */
public class TernarySearch {

    public static int ternarySearch(int[] list, int key) {
        int start = 0;
        int end = list.length - 1;


        return ternarySearch(list, key, start, end);
    }

    private static int ternarySearch(int[] list, int key, int start, int end) {
        int dif = end - start;
        // The list has been exhausted without a match
        //terminating conditions
        if (start > end || key < list[start] || key > list[end]) return -1;
        if (dif <= 3) {
            // perform a linear search
            for (int i = start; i <= end; i++)
                if (list[i] == key)
                    return i;
            return -1;
        } else {
            int one_third = dif / 3;
            // check if the element is this range
            if (key >= list[start] && key <= list[start + one_third]) {
                //check if the element is found
                if (key == list[start]) return start;
                if (key == list[start + one_third]) return start + one_third;
                // recursion
                return ternarySearch(list, key, start + 1, start + one_third - 1);
            } else
                // check if the element is this range
                if (key >= list[start + one_third] && key <= list[end - one_third]) {
                    //check if the element is found
                    if (key == list[start + one_third]) return start + one_third;
                    if (key == list[end - one_third]) return end - one_third;
                    // recursion
                    return ternarySearch(list, key, start + one_third + 1, end - one_third - 1);
                } else
                //the element is in the final range
                {
                    //check if the element is found
                    if (key == list[end - one_third]) return end - one_third;
                    if (key == list[end]) return end;
                    // recursion
                    return ternarySearch(list, key, end - one_third + 1, end - 1);
                }
        }

    }

//    public static <E extends Comparable<E>> int ternarySearch(E[] list, E key){
//
//        return 0;
//    }

    public static void main(String[] args){
        int[] test = {0,1,2,3,4,5,6,7,8,9,0,778,9,7878,990,7080,55345,234234,5435,45435345,643634,12234324,644363,2523532,6436436,643643,534543636,3464334};


        System.out.println(ternarySearch(test,9));
    }
}
