package Chapter6Methods;

import java.util.Scanner;

/**
 * Created by jjenkins on 10/4/2016.
 * Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header: public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (2 + 3 + 4).
 * (Hint: Use the % opera- tor to extract digits, and the / operator to remove the extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23).
 * Use a loop to repeatedly extract and remove the digit until all the digits are extracted. Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
 */
public class SUMDIGITS {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter and integer: ");
        long n = input.nextLong();
        int sum = sumDigits(n);
        System.out.print("The sum of the digits in "+n+" is "+sum);
    }

    public static int sumDigits(long n){


        int sum = 0;


        do {
            sum += n % 10;
            n = n / 10;
        } while (n != 0);
        //57657577899
        return sum;
    }
}
