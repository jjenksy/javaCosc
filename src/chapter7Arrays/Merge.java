package chapter7Arrays;

/**
 * Created by jjenkins on 10/18/2016.
 * Suppose you have two Arrays of ints, arr1 and arr2, each containing ins that are sorted in ascending order.
 * Write a static method name merge that recieves these two arrays as parameters and returns a reference to a new,
 * sorted array of ints that is the result of merging the contents of the two arrays, arr1 and arr2.
 *
 * Note: you do not need to (and should not sort here). Think of having two sorted piles of cards that you are merging
 * into another pile. You keep putting cards into the new pile, sometimes taking from one of your originale piles,
 * sometimes taking from the other.
 */
public class Merge {
    public static void main (String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 3, 4, 5, 6};

        int arr3[] = merge(arr1 ,arr2);
        //foreach loop to iterate my array
        for (int key:arr3) {
            System.out.println(key);
        }

    }
    public static int[] merge(int[] A, int[] B){
        int result[] = new int[A.length+B.length];
        int idex_A = 0;
        int idex_B = 0;
        int idex_result = 0;
        while(idex_A < A.length || idex_B < B.length){
            if(idex_B >= B.length || (idex_A < A.length && A[idex_A] < B[idex_B]))
                result[idex_result++] = A[idex_A++];
            else result[idex_result++] = B[idex_B++];
        }
        return result;
    }

}
