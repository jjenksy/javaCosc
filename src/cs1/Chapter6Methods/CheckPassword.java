package cs1.Chapter6Methods;

import java.util.Scanner;

/**
 * /**
 ** COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 10/6/2016
 * Some website impose certain rules for passwords. Write a method that checks whether a string is a valid password
 * Suppose the password rules are as follows
 * A password must have at least 8 characters
 * Password consists of only letters and digits
 * A password must containg at least 2 digits
 * Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or
 * Invalid Password otherwise.
 */
public class CheckPassword {
    public static void main(String args[]){
        //create a scanner obj
        Scanner input = new Scanner(System.in);
        //ask the user for inut
        System.out.print("Enter a password:");

        //check the input against the boolean messages
        if(checkPassword(input.nextLine())){
            System.out.println("Valid Password");
        }else{
            //if input false log to console
            System.out.println("Invalid Password");
        }
    }

    //public method run the checkpassword program
    public static boolean checkPassword(String pass){
        //if checkLength false return false
        if(checkLength(pass)){
            if (checkLettersDigits(pass)){//if checkLettesDigits false return false
                if(containsDigits(pass)){ //if containsDigits false return false
                    return true; //if all true return true
                }
            }
        }
            return false;


    }

    /**
     * Check if length is atleast 8 long
     */
    private static boolean checkLength(String pass){
        //return true if the length is greater then or equal to 8 and false otherwise
        return pass.length()>=8 ? true : false;
    }
    private static boolean checkLettersDigits(String pass){
        //regex to check for strings and numbers only
        String pattern= "^[a-zA-Z0-9]*$";
        if(pass.matches(pattern)){
            return true;
        }
        return false;
    }

    private static boolean containsDigits (String pass){
        int counter =0;//counter to see how many number
        //iterate over the string
        for (int i = 0; i<pass.length();i++){
            // if the char is a number using the ASCII Table values the incement the counter
            if(pass.charAt(i) >= 48 && pass.charAt(i) <=57 ){
                counter ++;
            }
        }
        //return true if the counter is greater or equal to 2 and false otherwise
        return counter >=2 ? true:false;
    }
}
