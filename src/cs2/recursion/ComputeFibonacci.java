package cs2.recursion;

import java.util.Scanner;

/**
 * Created by jjenkins on 4/11/2017.
 */
public class ComputeFibonacci {
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for a Fibonacci number");
        int index = input.nextInt();
        
        System.out.println("The Fibonacci number at index  " 
        + index + " is " +fib(index));
        }

    private static long fib(int index) {
        if(index ==0){
            return 0;
        }
        else if(index ==1){
            return 1;
        }else{
            return fib(index-1)+fib(index-2);
        }
    }
}
