package Chapter6Methods;



/**
 ** COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 10/3/2016
 * Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header: public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (2 + 3 + 4).
 * (Hint: Use the % opera- tor to extract digits, and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23).
 * Use a loop to repeatedly extract and remove the digit until all the digits are extracted. Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
 */

import java.util.Scanner;


public class SUMDIGITS {
    public static void main(String args []){
        //get a reference to a scanner obj
        Scanner input = new Scanner(System.in);
        System.out.print("Enter and integer:");//log what input we need to the console
        long n = input.nextLong(); // get the input
        int sum = sumDigits(n); //run method and get the return int value and store in sum
        System.out.println("The sum of the digits in "+n+" is "+sum); //log the answer to the console
    }

    /**
     * This method calculates the sum of all the digits input by the user
     * @param n
     * @return the int sum
     */
    public static int sumDigits(long n){

        int sum = 0; // the sum to be added to


        do {
            sum += n % 10;// add the remainder to the sum
            n = n / 10; // get rid of the trailing digit
        } while (n != 0); //once digit is zero stop the loop
        return sum;
    }
}
