package cs3.assignment1.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] list) {
        //itterate over the list
        for (int i = 0; i < list.length; i++) {
            int currentElem = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElem; k--) {
                list[k + 1] = list[k];
            }
            // Insert the current element into list[k + 1]
            list[k + 1] = currentElem;
        }
    }


    public static void main(String[] args){
        int[] list = new int[]{2, 1, 5, 7, 8, 9, 4, 1};
        InsertionSort.insertionSort(list);
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] +", ");
        }
    }
}
