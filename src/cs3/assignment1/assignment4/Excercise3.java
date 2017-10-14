package cs3.assignment1.assignment4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
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
        Map<String,Integer> stringMap = new HashMap<String,Integer>();
        Scanner scan = new Scanner(System.in);
    /* here we take input string from user */
        System.out.print("Enter the String\n");
        String s = scan.next();
        String t="";
        int len=0;
        for(int i=0;i< s.length()-1;i++)
        {
            if((s.charAt(i+1)- s.charAt(i))> 0)
            {
                t = t + s.charAt(i) ;
                len=len+1;
            }
            else
            {
                t = t+ s.charAt(i);
                len=len+1;
                stringMap.put(t,len); /* here we insert substrings with respect to their lengths in hashmap*/
                len=0;
                t="";
            }
            if(i == s.length()-2)
            {
                if(s.charAt(s.length()-1)- s.charAt(s.length()-2) > 0)
                {
                    t=t+s.charAt(i+1);
                    len=len+1;
                    stringMap.put(t,len);
                }
                else
                {
                    t="";len=0;
                    t=t+s.charAt(i+1);
                    stringMap.put(t,len);
                }
            }
        }
        int maxValueInMap=(Collections.max(stringMap.values())); /* This will return max value in the Hashmap */
        for (java.util.Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     /* Print that maximum increasingly ordered substring */
            }
        }
    }

}