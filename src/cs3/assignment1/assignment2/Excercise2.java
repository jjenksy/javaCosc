package cs3.assignment1.assignment2;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by jenksy on 9/24/17.
 * Write a Java program that creates two priority queues, {"George", "Jim", "John", "Blake",
 "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}, and find their union,
 difference, and intersection.
 */
public class Excercise2 {

    public static void main(String[] args){
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        PriorityQueue<String> union = new PriorityQueue<>(priorityQueue1);
        PriorityQueue<String> tmp = new PriorityQueue<>(priorityQueue2);

        String s;
        while ((s = tmp.poll()) != null) {
            if (!union.contains(s)) {
                union.add(s);
            }
        }
        System.out.println("Union set: " + union);

        PriorityQueue<String> difference = new PriorityQueue<>(priorityQueue1);
        difference.removeAll(priorityQueue2);
        System.out.println("Difference: " + difference);

        PriorityQueue<String> intersection = new PriorityQueue<>(priorityQueue1);
        intersection.retainAll(priorityQueue2);
        System.out.println("Difference: " + intersection);

    }





}
