package cs2.assignment4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by jjenkins on 4/20/2017.
 * 1)	Write a ternarySearch() method using recursion. A ternary search is similar to a binary search,
 * but it divides the array into three pieces rather than two. A ternary search finds the points that divide
 * the array into three roughly equal pieces, and then uses these points to determine where to search for the key. The binary search method is shown in Listing 18.6 on page 716 of your textbook.
 * Create a main method that prompts the user for the size of the array and generates it randomly. It should also prompt the user for the key (number that is to be searched for).
 * Then display the array, sort it (which is a pre-requisite for a ternary search) using either the Java Sort method (java.util.arrays.Sort)
 * or one you’ve written, search for the key, and show where it is found (or not found).
 */
class Test {
    public static void main(String[] args) {
        //RandomAccessFile rand = new RandomAccessFile("Test.dat","rw");
        int[] ints = {1,2,3,4,5};
        Date date = new Date();
        double val = 5.5;

        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Test.dat", true));
            for (int i = 0; i <ints.length ; i++) {
                obj.writeInt(ints[0]);
            }
            obj.writeObject(date);
            obj.writeDouble(val);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }
}
