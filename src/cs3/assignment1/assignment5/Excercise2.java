package cs3.assignment1.assignment5;

import java.util.Arrays;

/**
 * Exercise 2. Please generate an array with 12 elements, which is the worst case for the first iteration of
 QUICKSORT algorithm and then is the best case for the second iteration of QUICKSORT algorithm
 (The first element is used as Pivot). Please explain why your answer is the worst case and the best case
 for the first and second iterations.
 */
public class Excercise2 {

    static void quickSort(int[] arr,int start,int last)
    {
        int i=start+1,j=last,temp;
        if(i>j)
            return;
        while(i<=j)
        {
            System.out.println("sorting");
            if(arr[i]<arr[start])
            {
                i++;
            }
            if(arr[j]>arr[start])
            {
                j--;
            }
            if(i<=j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        temp=arr[start];
        arr[start]=arr[j];
        arr[j]=temp;

        quickSort(arr,start,j-1);
        quickSort(arr,j+1,last);
    }

    public static void main(String[] args){
        int[] list = { 4, 55, 66, 77 , 34 ,54, 8, 10, 3, 50, 3, 6};

        quickSort(list, 0,11);

        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]);
        }


    }
//    worst case and the best case for the first and second iterations:
//
//    Ans)Worst case vs. best case: Your algorithm has diﬀerent runtimes on diﬀerent inputs, and a lot of times we want to know how fast the algorithm runs on an input of a certain size. Worst case runtime means that you are feeding the worst possible input (of that size) into your algorithm. Best case runtime means that you are feeding the best possible input into your algorithm. For an input of size n, perhaps the worst case runtime is T(n) = 2n2 + 5, and the best case runtime is 3n.
}
