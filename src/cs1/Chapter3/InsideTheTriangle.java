package cs1.Chapter3;

import java.util.Scanner;

/**
 * Created by jjenkins on 9/8/2016.
 * Suppose a right triangle is placed in a plane as shown in the book. The right-angle point
 * is placed at (0,0), and the other two points are placed at (200 , 0), and (0,100). Write a
 * program that prompts the user to enter a point with x- and y-cordinates and determines whether the point is
 * inside the triangle.
 *
 */


public class InsideTheTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       double x, y ,x1 = 200,y1 = 0,x2 = 0,y2 = 100;


        System.out.print("Enter a point's x- and y-coordinates: ");
        x = s.nextInt();
        y = s.nextInt();


       double yx = -x/2 + 100;





        if( x >= x2 && x <= x1 && y >= y1 && y <= y2 && y <= yx) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
