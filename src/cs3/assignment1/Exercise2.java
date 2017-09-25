package cs3.assignment1;

/**
 *  **Instructor: Jing Zhang, PhD
 * Programming Assignment 1 Exercise2
 * Created by jenksy on 9/14/17.
 * Complete the following Java method that returns the maximum element of an array:
 */
public class Exercise2{
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        System.out.println(max(numbers));
        String[] words = {"red", "green", "blue"};
        System.out.println(max(words));
        Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println(max(circles));
    }
    static class Circle implements Comparable<Circle> {
        double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public int compareTo(Circle c) {
            if (radius < c.radius)
                return -1;
            else if (radius == c.radius)
                return 0;
            else
                return 1;
        }
        @Override
        public String toString() {
            return "Circle radius: " + radius;
        }
    }
    public static <E extends Comparable<E>> E max(E[] list) {
        // Your code here!
        //set the max value to the first index in the array
        E max = list[0];
        //itterate through the list
        for (int i = 0; i < list.length; i++) {
            //check using the compare to method to see if current index is greater then max
            if(list[i].compareTo(max)>0){
                //set max to new index when statement is true
                max = list[i];
            }
        }
        return max;
    }
}
