package Chapter5;

/**
 ** COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 10/3/2016
 * NestedLoops
 * Use nested loops that display the following patterns in a single program:
 *Pattern 1:
 **********
 *********
 *********
 *********
 *Patter 2:
 *
 **
 ***
 ****
 *****
 *Bonus Pattern:
 *12345
 *1234
 *123
 *12
 *1
 */
public class NestedLoops {
    public static void main(String args []){
        //Print the header to the console
        System.out.println("Pattern 1:");
        //iterate over the data create one line for each iteration of the first for loop
        for (int i = 1; i <= 4; i++) {
            //Printing a line of 9 asterisks for each iteration of the second loop
            for (int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            //add a new line between asterisk lines
            System.out.println();

        }
        //add a new line between patterns
        System.out.println();



        //Print the header
        System.out.println("Pattern 2:");
        //create the rows
        for (int i = 1; i <= 5; i++) {

            // Printing number incrementally columns kinda
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //add a new line every iteration of the outer for loop
            System.out.println();

        }
        //add a new line at the end
        System.out.println();
        //create a header and print to console
        System.out.println("Bonus Pattern:");
        //outer for loop to determine the each line
        for (int i = 0; i < 5; i++) {

            //inner for loop prints on one line and compares to outer for loops incrementing variable
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j + " ");
            }
            //newline
            System.out.println();

        }

    }
}
