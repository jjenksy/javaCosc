package cs2.assignment4;

import cs2.lab5.GeometricObject;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Comparator;

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

    /**
     * Generic bubble sort method using comparable
     */
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    /**
     * Generic bubble sort method using comparator
     */
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    // Swap list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }

    }

    /** A test method */
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] listArray = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        // Carate a Double array
        Double[] doubleArray = {3.4, 1.3, -22.1, 14.8, 6.0, 2.3, 12.2};

        // Create a Character array
        Character[] charArray = {'a', 'J', 'r'};

        // Create a String array
        String[] stringArray = {"Tom", "Susan", "Kim"};

        // Sort the arrays
        bubbleSort(listArray);
        bubbleSort(doubleArray);
        bubbleSort(charArray);
        bubbleSort(stringArray);

        printList(listArray);
        printList(charArray);
        printList(stringArray);
        printList(doubleArray);

        
    }

    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    /** Print the sorted elements */
    public static void printList(GeometricObject[] list) {
        System.out.print("Sorted elements: ");
        for (GeometricObject e: list) {
            System.out.printf("%.2f ", e.getArea());
        }
        System.out.println();
    }
}
