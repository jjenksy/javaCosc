package Chapter8MultiDimArrays;

import java.util.Scanner;

/**
 * Created by jjenkins on 11/09/2016.
 * Write a program that reads an 3 by 4 matrix and displays the sum of each
 * column and each row separately.
 * Here is the sample run:
 * Enter a 3 by4 matrix row by row:
 * 1.5 2 3 4
 * 5.5 6 7 8
 * 9.5 1 3 1
 * Sum of the elements at column 0 is 16.5
 * Sum of the elements at column 1 is 9.0
 * Sum of the elements at column 2 is 13.0
 * Sum of the elements at column 3 is 13.0
 * Sum of the elements at Row 0 is: 10.5
 * Sum of the elements at Row 1 is: 26.5
 * Sum of the elements at Row 2 is: 14.5
 * Bonus: Rewrite your program with a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * Public static double sumColumn (double[][] m, int columnIndex){
 *
 * }
 */
public class MultidimensionalArrays {
    public static void main(String[] args) {

        //create a matrix multi-dimensional array
        double[][] matrix = new double[3][4];
        //create a scanner input obj
      Scanner input = new Scanner(System.in);
        //ask the user for input
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        //loop through the rows
        for (int row = 0; row < matrix.length; row++) {
            //loop through each column in the row
            for (int column = 0; column < matrix[row].length; column++) {
                //assign the input to each row/column index in the array
                matrix[row][column] = input.nextDouble();
            }
        }

        for (int column = 0; column < matrix[0].length; column++) {
            //output the total of each column
            System.out.println("Sum of the elements at column " + column
                    + " is " + sumColumn(matrix, column));
        }

    }

    /**
     * This method takes in two args, a multi-dimensional array an a column index
     * @param matrix the array
     * @param col the int column pos
     * @return the sum of the column
     */
    public static double sumColumn(double[][] matrix, int col) {

        //declare a var to hold the sum
        double sum = 0;
        // loop though roms
        for (int row = 0; row < matrix.length; row++) {
            //calculate the total of the columns
            sum += matrix[row][col];
        }
        return sum;
    }
}
