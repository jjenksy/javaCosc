package cs2.LectureAssignments.programmingassignment1;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  * * John Jenkins
 * 02/19/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Programming Assignment I
 * Created by jenksy on 2/19/17.
 * 1.	Write a Java method that removes any duplicate elements from an ArrayList of integers. The method has the following header(signature):
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program (with main method) that prompts the user to enter 10 integers to a list and displays the distinct integers separated by exactly one space. Here is what the input and output should look like:
 * Enter ten integers: 28 4 2 4 9 8 27 1 1 9
 * The distinct integers are 28 4 2 9 8 27 1

 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.print("Enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(input.nextInt());

        System.out.println("Removing duplicates...");
        removeDuplicate(list);
        System.out.print("The distinct integers are: ");
        System.out.println(list.toString());
    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> indistinct = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (!indistinct.contains(list.get(i))) {
                indistinct.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(indistinct);

    }
}
