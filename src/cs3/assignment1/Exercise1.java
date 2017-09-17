package cs3.assignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jenksy on 9/14/17.
 *
 * Given an ArrayList, write a Java method that returns a new ArrayList which
 * contains only the non-duplicate elements from the original list.
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList.toString());
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        //create a HashSet out of th list. Since Sets contains no duplicates it will remove them
        Set<E> set = new HashSet<>(list);
        //return a new arraylist with from the set
        return new ArrayList<>(set);
    }

}
