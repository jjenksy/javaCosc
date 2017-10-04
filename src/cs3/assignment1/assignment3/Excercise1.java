package cs3.assignment1.assignment3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *  **
 *  Instructor: Jing Zhang, PhD
 * Programming Assignment 3 Exercise1
 * Created by jenksy on 10/01/17.
 * Create two linked hash sets {"George", "Jim", "John", "Blake", "Kevin", "Michael"} and {"George",
 "Katie", "Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection. (You can clone the sets
 to preserve the original sets from being changed by these set methods)
 */
public class Excercise1 {
    public static void main(String[] args) {

        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2 + "\n");

        // Union
        LinkedHashSet<String> union = (LinkedHashSet<String>)set1.clone();
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Difference
        HashSet<String> difference = (LinkedHashSet<String>) set1.clone();
        HashSet<String> dif2Set = (LinkedHashSet<String>) set2.clone();
        difference.removeAll(set2);
        dif2Set.removeAll(set1);
        difference.addAll(dif2Set);
        System.out.println("Difference: " + difference);

        LinkedHashSet<String> intersection = (LinkedHashSet<String>) set1.clone();
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);



    }
}
