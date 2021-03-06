package cs2.assignment4;

import java.util.Scanner;

/**
 *  * *John Jenkins
 * 05/09/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Created by johnjenkins on 5/4/17.
 * Write a recursive method (count) that finds the number of occurrences of a specified character in an array. You need to define the following two methods. The second one is a recursive helper method.
 public static int count(char[] chars, char ch)
 public static int count(char[] chars, char ch, int high)

 Write a test program (CharSearch) that prompts the user to enter a list of characters in one line, and then a character to count. Next, it displays the number of occurrences of the character in the list.
 */
public class Count {

    public static void main(String[] args) {

        CharSearch();
    }

    /**
     * Test method that prompts the user to entet a list of chars in one line and then a char to count the
     * occurances of. Then it displays the number of occurances in the list.
     */
    private static void CharSearch() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters in one line: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        char[] chars = s.replaceAll(" ", "").toCharArray();
        System.out.println("The occurrences of '" + ch + "' in \"" + s + "\" = " + count(chars, ch));
    }

    private static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    private static int count(char[] chars, char ch, int high) {

        int count = (chars[high] == ch) ? 1 : 0;

        if (high == 0)
            return count;
        else
            return count + count(chars, ch, high - 1);
    }
}
