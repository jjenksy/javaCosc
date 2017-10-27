package cs3.assignment1.assignment5;


import java.util.Arrays;

import static cs3.assignment1.assignment5.Radix.getMax;

/**
 * Instructor: Jing Zhang, PhD
 * Programming Assignment 3 Exercise3
 * Created by John Jenkins on 10/20/17.
 * Exercise 3. Given the following list of positive integers, use radix sort to sort them in an increasing
 order: 439 45 234 91 649 932 47 829 48 732 843 236 727 462 828 999 619 503 290 83 439 545 9 475
 683 889 497
 */
public class Excercise3 {


    // A function to do counting sort of arr[] according to
// the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

// Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[ (arr[i]/exp)%10 ]++;

// Change count[i] so that count[i] now contains
// actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

// Build the output array
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
            count[ (arr[i]/exp)%10 ]--;
        }

// Copy the output array to arr[], so that arr[] now
// contains sorted numbers according to curent digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of size n using
// Radix Sort
    static void radixsort(int arr[], int n)
    {
// Find the maximum number to know number of digits
        int m = getMax(arr, n);

// Do counting sort for every digit. Note that instead
// of passing digit number, exp is passed. exp is 10^i
// where i is current digit number
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // A utility function to print an array
    static void print(int arr[], int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }


    /*Driver function to check for above function*/
    public static void main (String[] args)
    {
        int arr[] = {439, 45, 234, 91, 649, 932, 47, 829, 48, 732, 843, 236, 727, 462, 828, 999, 619, 503, 290, 83, 439, 545, 9, 475, 683, 889, 497};
        int n = arr.length;
        radixsort(arr, n);
        print(arr, n);
    }
}

class Radix {

    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
}