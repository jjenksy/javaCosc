package cs3.assignment1;

import java.util.ArrayList;

/**
 * Created by jenksy on 9/14/17.
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
        System.out.print(newList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Your code here!
        //todo implement code
        return new ArrayList<>();
    }

}
