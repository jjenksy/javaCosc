package cs1.Chapter3;

/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 9/09/2016
 * Rock Paper Scissors Lab 3
 *******************************/

import java.util.Scanner;

/**
 * Created by jjenkins on 9/9/2016.
 * Program Rock.java contains a skeleton for the game Rock, Paper, Scissors. Add statements to the program as indicated by
 * the comments so that the program asks the user to enter a number 0, 1, 2
 * representing scissor, rock, and paper, and generates a random play for the computer,
 * compares them and announces the winner (and why).
 */
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int computerPlay;//int to hold my random num

        //generate a random num from 1 to 3
        computerPlay = (int)(Math.random() * 2);//Generate computer's play (0,1,2) using Math.random() and save to a variable named //computerPlay

        // Prompt to let the user input Scissor (0), rock(1), paper (2)
        System.out.println("Please input your choice\n" +
                "Scissor (0), rock(1), paper (2): ");
        int personPlay = input.nextInt();// read in user input number and save it in a variable named choice



    

//See who won. Use nested ifs instead of &&.
        if (personPlay == computerPlay){
            System.out.println("It's a tie!");
        }
        else {
            if (personPlay == 0)
                if (computerPlay == 1){
                    System.out.println("The computer is rock. You are scissor. You Lose."); // print out proper result.
                }
                else{
                    System.out.println("The computer is paper. You are scissor. You Win.");
                    // computerPlay must be 2, why? because computer and person were not even, person equaled 0 but computer play did not equal 1 therefore it is 2
                }
            if (personPlay == 1) // similar to personalPlay is 0
            {
                if (computerPlay == 0){
                    System.out.println("The computer is scissor. You are rock. You Win."); // print out proper result.
                }
                else{
                    System.out.println("The computer is paper. You are rock. You Lose.");
                    // computerPlay must be 2, why? because computer and person were not even, person equaled 0 but computer play did not equal 1 therefore it is 2
                }

            }
            if (personPlay == 2)// similar to personalPlay is 1
            {
                if (computerPlay == 0){
                    System.out.println("The computer is scissor. You are Paper. You Lose."); // print out proper result.
                }
                else{
                    System.out.println("The computer is rock. You are Paper. You Win.");
                    //computer must be 1

                }

            }

        } // end of else
    } // end of main

}
