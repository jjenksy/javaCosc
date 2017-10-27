package cs3.assignment1.midterm;

import java.util.*;

public class WildCardNeedDemo {
   public static void main( String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a series of numbers ending with 0: ");

       int longetSequenceCount = 0;
       int longestSequenceValue = 0;
       int longestSequenceIndex = 0;

       int currentLongestSequenceCount = 1;
       int currentLongestSequenceValue = 0;
       int value;
       int index = 0;
       int previos = 0;
       do {
           value = input.nextInt();
           if(value == previos){
               currentLongestSequenceCount++;
           } else if (currentLongestSequenceCount>longetSequenceCount){
               longetSequenceCount = currentLongestSequenceCount;
               //make sure we get the previous here
               longestSequenceValue = currentLongestSequenceValue;
               // get the actual value
               currentLongestSequenceValue = value;
               //reset the count
               currentLongestSequenceCount =1;
                if(currentLongestSequenceValue == value) {
                    longestSequenceIndex = index - longetSequenceCount;
                }
           }

           previos = value;
           index++;
       } while (value != 0);


       System.out.println("The longest same number sequence starts at " +
       longestSequenceIndex + " with " + longetSequenceCount +
       " values of " + longestSequenceValue);

   }
}
