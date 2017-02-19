package cs1.Chapter8MultiDimArrays;

import java.util.Scanner;

/**
 * ** COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 11/07/2016
 * Created by jjenkins on 11/11/2016.
 * Nine coins are placed in 3x3 matrix with some face up and some face down.
 * You can represent the state of the coins using 3x3 matrix with values 0(heads) and 1(tails).
 * Here are some examples:
 * 000101110
 * 010001100
 * 000100001
 * Each State Can be represented using binary number. For example preceding
 * matrices correspond to the numbers:
 * 000010000 101001100 110100001
 *
 *There are a total of 512 possiblilities, so you can use decimal bums to rep all the staes.
 * Write a program that prompts the user to enter a number between 0 and 511 and displays
 * the corresponding matrix with the character H and T.
 */
public class HeadsAndTails {
    public static void main(String[] args) {

        //the multi-dimentional matrix array
        int[][] matrix = new int[3][3];

        //scanner object
        Scanner input = new Scanner(System.in);
        //ask the user for input
        System.out.print("Enter an integer representing the state of the coins:");
        //get the input and assign it to an int
        int numbeOfCoins = input.nextInt();
        String binary = decimalToBinary(numbeOfCoins);

        // put 1's and 0's using binary string
        int binaryIndex = 0; // binary string index
        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[i].length; k++) {
                int coinSide = (binary.charAt(binaryIndex++) == '0') ? 0 : 1;
                matrix[i][k] = coinSide;
            }
        }
        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[i].length; k++) {
                char ch = (matrix[i][k] == 0) ? 'H' : 'T';
                System.out.print(ch + " ");
            }
            System.out.println("");
        }

    }

    public static String decimalToBinary(int i) {

        StringBuilder binary = new StringBuilder();
        while (i != 0) {
            binary.append(i & 1);
            i = i >> 1;
        }
        while (binary.length() < 9) {
            binary.insert(0, "0");
        }
        return binary.toString();
    }

}
