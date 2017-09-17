package cs3.assignment1;

import java.util.ArrayList;
import java.util.List;

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
        // make a copy of the array
        ArrayList<E> newList = new ArrayList<>(list);
        ArrayList<E> nonDuplicate = new ArrayList<>();
        //outer list to check each
        for (E check:list) {
            for (E toCheck:newList) {
                if (!check.equals(toCheck)){
                    nonDuplicate.add(check);
                }
            }
        }
        //todo implement code
        return nonDuplicate;
    }

}
