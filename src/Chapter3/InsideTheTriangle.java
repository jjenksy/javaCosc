package Chapter3;

import java.util.Scanner;

/**
 * Created by jjenkins on 9/8/2016.
 * Suppose a right triangle is placed in a plane as shown in the book. The right-angle point
 * is placed at (0,0), and the other two points are placed at (200 , 0), and (0,100). Write a
 * program that prompts the user to enter a point with x- and y-cordinates and determines whether the point is
 * inside the triangle.
 *
 */

//1) check the 'square' bounds
//        if( x < 0 || x > 200 || y < 0 || y > 100 ) // not in triangle
//
//        2) check the hypothenuse.
//        get the equation of the line:
//        y(x) = -x/2 + 100
//
//        Now for point (xp,yp)
//        if( yp < y(x) ) // point is inside

public class InsideTheTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;


        System.out.print("Enter a point's x- and y-coordinates:");
        x = s.nextInt();
        y = s.nextInt();



        double hyp = Math.sqrt(((Math.pow(100 , 2))+ (Math.pow(200, 2))));


        double newHypY =  Math.sqrt(((Math.pow(y , 2))+ (Math.pow(200, 2))));
        double newHyX =  Math.sqrt((Math.pow(100 , 2)+ Math.pow(x, 2)));

        System.out.println(hyp < newHypY && hyp < newHyX);

        // point is in the triangle if yp <= yx
        if( x <= 0 && x >= 200 && y >= 0 && y < 100 && hyp < newHypY && hyp < newHyX ) {
            System.out.println("The point is in the triangle");
        } else {
            System.out.println("The point is not in the triangle");
        }
    }
}
