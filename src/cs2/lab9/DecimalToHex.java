package cs2.lab9;

import java.util.Scanner;

/**
 * Created by jenksy on 4/14/17.
 */
public class DecimalToHex {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();

        System.out.print(number + " in binary is " + dec2Hex(number));
    }

    private static String dec2Hex(int number) {

        if (number < 16)
            return getHexFormat(number);
        else
            return  dec2Hex(number / 16) + getHexFormat(number % 16);
    }

    private static String getHexFormat(int n) {

        if (n > 9 && n < 16)
            return (char)(n - 10 + 'A') + "";
        if (n >= 0)
            return n + "";
        else
            return "INVALID";
    }
}
