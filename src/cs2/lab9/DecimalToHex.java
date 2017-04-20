package cs2.lab9;

import java.util.Scanner;

/**
 * * John Jenkins
 * 04/16/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 9 Hw9
 * Due Date: Moday, April 17, 2017
 * Created by jenksy on 4/14/17.
 * (Decimal to hex) Write a recursive method that converts a decimal number into a hex number as a string.
 * The method header is:
 * public static String dec2Hex(int value)
 * Write a test program that prompts the user to e
 * nter a decimal number and displays its hex equivalent.
 */
public class DecimalToHex {

    public static void main(String[] args) {

        System.out.print("Enter a decimal number: ");
        Scanner input = new Scanner(System.in);


        System.out.print(input + " in binary is " + dec2Hex(input.nextInt()));
    }

    /**
     * dec2Hex turns a decimal to a hex
     */
    private static String dec2Hex(int value) {
        String result = "";
        return dec2Hex(value, result);
    }

    /**
     *  Recursive helper method
     * @param value the int value to turn to hex
     * @param result
     * @return the recursive value
     */
    private static String dec2Hex(int value, String result) {
        int r = value % 16; // Remainder
        String remainder = r >= 10 ?
                String.valueOf((char)('A' + r % 10)) : String.valueOf(r);

        if (value / 16 == 0) // Base case
        {
            return remainder + result;
        } else {
            return dec2Hex(value / 16, remainder + result); // Recursive call
        }

    }
}
