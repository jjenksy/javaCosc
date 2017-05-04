package cs2.assignment4;

/**
 * Created by johnjenkins on 5/4/17.
 * Write a generic bubble sort method. The bubble sort sorts the elements using the Comparable interface. The method header is as follows.

 public static <E extends Comparable<E>> void bubblesort(E[] list)

 The main method should declare an array of Double values, sort the array, and print out the array. It should look something like the following.

 public static void main(String[] args) {
 Double[] list = {2.1, 3.5, 2, 5.5, 6.1, 1.3, -2.0, 3.1, 14.5, 12.8};
 bubbleSort(list);
 for (int i = 0; i < list.length; i++)
 System.out.print(list[i] + " ");

 */
public class Bubblesort {

    public static <E extends Comparable<E>> void bubblesort(E[] list){

    }

    public static void main (String[] args){
        Double[] list = {2.1, 3.5, 2.0, 5.5, 6.1, 1.3, -2.0, 3.1, 14.5, 12.8};
        bubblesort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
