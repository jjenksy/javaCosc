package cs2.assignment4;

/**
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
        int low = 0;
        int high = list.length - 1;
        return ternarySearch(list, key, low, high);
    }

    private static int ternarySearch(int[] list, int key, int low, int high) {
        // The list has been exhausted without a match
        if (low > high){
            return -low - 1;
        }
        int mid = (low + high) / 2;
        if (key < list[mid]){
            return ternarySearch(list, key, low, mid - 1);
        }
        else if (key == list[mid]){
            return mid;
        }
        else {
            return ternarySearch(list, key, mid + 1, high);
        }

    }

//    public static <E extends Comparable<E>> int ternarySearch(E[] list, E key){
//
//        return 0;
//    }
}
