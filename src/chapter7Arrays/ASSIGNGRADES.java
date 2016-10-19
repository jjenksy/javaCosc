package chapter7Arrays;



/**
 * Created by jjenkins on 10/19/2016.
 * Write a program that reads student scores, gets the best score, and then assigns grades based on the
 * following scheme:
 * Grade is A if score is >= best -10;
 * Grade is B if score is >= best - 20;
 * Grade is C if score is >= best -30;
 * Grade is F otherwise.
 *
 * The program prompts the user to enter the total number of students, then prompts the user to enter all the scores,
 * and concludes by displaying the grades.
 */

import java.util.Scanner;

public class ASSIGNGRADES {
    public static void main(String args[]){

        ASSIGNGRADES();

    }


    public static void ASSIGNGRADES() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int students =input.nextInt();
        int[] scores = new int[students];
        System.out.print("Enter "+students+" scores:");
        //get all my inputs
        for(int i=0; i<students; i++){

            scores[i]=input.nextInt();
        }

        int best = 0;
        //determine the highest score
        for (int key:scores) {
            if(key > best){
                best = key;
            }
        }

        // Processing grades

        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                grade = 'A';
            else if (scores[i] >= best - 20)
                grade = 'B';
            else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }

    }
}
