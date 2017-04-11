package cs2.recursion;

import java.util.Scanner;

/**
 * Created by jjenkins on 4/11/2017.
 */
public class ComputeFactorial {

    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int n = input.nextInt();

        System.out.println("The factorial of n is : " + factorial(n));
        }

    private static long factorial(int n) {
        if(n==0){//base case
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
