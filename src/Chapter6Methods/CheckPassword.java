package Chapter6Methods;

import java.util.Scanner;

/**
 * Created by jjenkins on 10/4/2016.
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password:");

        if(checkPassword(input.nextLine())){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }

    public static boolean checkPassword(String pass){
        if(checkLength(pass)){
            if (checkLettersDigits(pass)){
                if(containsDigits(pass)){
                    return true;
                }
            }
        }
            return false;


    }
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
