package cs1.Chapter3;

import java.util.Scanner;
/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 9/09/2016
 * Selections 1 Lab 3
 *******************************/
/**
 * Created by jjenkins on 9/9/2016.
 * Programming Question
 * A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).
 * cost(weight) = 3.5, if 0 < weight <= 1
 * cost(weight) = 5.5, if 1 < weight <= 3
 * cost(weight) = 8.5, if 3 < weight <= 10
 * cost(weight) = 10.5, if 10 < weight <= 20
 * Write a program that prompts the user to enter the weight of the package and the price of the product, then display the shipping cost and total bill.
 * If the weight is greater than 20, display a message “the package cannot be shipped”.
 * If the user input invalid numbers (negative numbers for the weight and price),
 * display the message “The weight/Price cannot be negative”.
 */
public class Selections1 {
    public static void main(String[] args) {

        //create a scanner object called input
        Scanner input = new Scanner(System.in);

        //print to the console and take users input
        System.out.print("Please input the weight of the package (in pounds): ");
        int weight = input.nextInt();

        //print to the console and take users input
        System.out.print("Please input the price of the product (in dollars): ");
        int dollars = input.nextInt();

        // determine if weight is within assignment params
        if(weight>0 && dollars>0){
            if(0 < weight && weight <= 1 ){
                shippingDetails(3.5, dollars);
            }
            else if(1 < weight && weight <= 3 ){
                shippingDetails(5.5, dollars);
            }
            else if (3 < weight && weight <= 10 ){
                shippingDetails(8.5, dollars);
            }
            else if (10 < weight && weight <= 20 ){
                shippingDetails(10.5, dollars);
            }
            else{

                // if not withing positive params. Output to console
                System.out.println("the package cannot be shipped");
            }
        }
        else {
            // if negative output to console
            System.out.println("The weight/Price cannot be negative");
        }




    }

    /**
     *
     * @param frieghtCost the cost of the frieght based on weight
     * @param dollars the cost of the item
     */
    private static void shippingDetails(double frieghtCost, int dollars){


        //log info to console
        System.out.println("The shipping cost (in dollars): " + frieghtCost);
        //cast int to double then add and log to console
        System.out.println("The total amount is (in dollars): " +((double)dollars + frieghtCost));

    }
}
