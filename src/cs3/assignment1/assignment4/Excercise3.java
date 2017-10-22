package cs3.assignment1.assignment4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *  *  Instructor: Jing Zhang, PhD
 * Programming Assignment 3 Exercise1
 * Created by jenksy on 10/07/17.
 * Exercise 3. Write a program that prompts the user to enter a string and displays the maximum
 consecutive increasingly ordered substring. For example, if the input string is "abcabcdgabmnsxy", then
 the maximum increasingly ordered substring is "abmnsxy". Analyze the time complexity of your
 program.
 Hint. charAt(int i) returns the character of the current String object at index i. For example:
 "soMeStriNG".charAt(2) returns ‘M’
 */
public class Excercise3 {
    public static void main(String[] args)
    {
        Map<String,Integer> stringMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
    /* here we take input string from user */
        System.out.println("Enter the String\n");
        String input = scan.next();
        String value="";
        int len=0;
        for(int i=0;i< input.length()-1;i++)
        {
            if((input.charAt(i+1)- input.charAt(i))> 0)
            {
                value = value + input.charAt(i) ;
                len=len+1;
            }
            else
            {
                value = value+ input.charAt(i);
                len=len+1;
                //insert the substring
                stringMap.put(value,len);
                len=0;
                value="";
            }
            if(i == input.length()-2)
            {
                if(input.charAt(input.length()-1)- input.charAt(input.length()-2) > 0)
                {
                    value=value+input.charAt(i+1);
                    len=len+1;
                    stringMap.put(value,len);
                }
                else
                {
                    value="";len=0;
                    value=value+input.charAt(i+1);
                    stringMap.put(value,len);
                }
            }
        }
        int maxValueInMap=(Collections.max(stringMap.values()));
        for (java.util.Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }

}