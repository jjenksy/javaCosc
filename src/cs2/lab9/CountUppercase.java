package cs2.lab9;

import java.util.Scanner;

/**
 * Created by jenksy on 4/14/17.
 */
public class CountUppercase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The number of uppercase letters = " + count(s.toCharArray()));
    }

    public static int count(char[] chars) {

        return count(chars, chars.length - 1);
    }

    public static int count(char[] chars, int high) {

        int count = Character.isUpperCase(chars[high]) ? 1 : 0;
        if (high == 0)
            return count;
        else
            return count + count(chars, high - 1);

    }
}
