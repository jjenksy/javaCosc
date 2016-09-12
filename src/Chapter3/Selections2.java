package Chapter3;
/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 9/09/2016
 * Selections 2 Lab 3
 *******************************/
/**
 * Created by jjenkins on 9/9/2016.
 * Question: write a program that randomly generates an integer between
 * 1 and 12 and displays the English month names January, February,…
 * , December for the number 1, 2, … 12 using switch-case statement.
 * Print out the random number and the English name
 */
public class Selections2 {
    public static void main(String[] args) {
        int randomNum;//int to hold my random num

        //generate a random num from 1 to 12
        randomNum = (int)(Math.random() * 12 + 1);

        //switch statement to determine the month based on the int value
        switch (randomNum){
            case 1:
                printData("January",randomNum);
                break;
            case 2:
                printData("February",randomNum);
                break;
            case 3:
                printData("March",randomNum);
                break;
            case 4:
                printData("April",randomNum);
                break;
            case 5:
                printData("May",randomNum);
                break;
            case 6:
                printData("June",randomNum);
                break;
            case 7:
                printData("July",randomNum);
                break;
            case 8:
                printData("August",randomNum);
                break;
            case 9:
                printData("September",randomNum);
                break;
            case 10:
                printData("October",randomNum);
                break;
            case 11:
                printData("November",randomNum);
                break;
            default:
                printData("December",randomNum);
                break;

        }

    }

    /**
     *
     * @param month String representation of Month
     * @param rand the random int that is generated
     */
    public static void printData(String month, int rand){
        System.out.println("The random number is:" + rand);
        System.out.println("It is "+ month);
    }
}
