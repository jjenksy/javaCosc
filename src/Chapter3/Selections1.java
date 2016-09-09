package Chapter3;

import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the weight of the package (in pounds): ");
        int weight = input.nextInt();

        System.out.print("Please input the price of the product (in dollars): ");
        int dollars = input.nextInt();

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

                System.out.println("the package cannot be shipped");
            }
        }
        else {
            System.out.println("The weight/Price cannot be negative");
        }




    }
    private static void shippingDetails(double frieghtCost, int dollars){


        System.out.println("The shipping cost (in dollars): " + frieghtCost);
        System.out.println("The total amount is (in dollars): " +((double)dollars + frieghtCost));

    }
}
