package cs1.Chapter10;

/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 11/18/2016
 * Created by jjenkins on 11/14/2016.
 * Test Class for Restangle assignment
 */
public class Test {

    public static void main (String [] args){
        Rectangle a = new Rectangle(4.0,40.0);


        //Rectangle A
        System.out.println("The width is " + a.getWidth());
        System.out.println("The length is " + a.getLength());
        System.out.println("The area is " + a.getArea());
        System.out.println("The perimeter is " + a.getPerimeter());
        System.out.print(a.toString());
        //Rectangle B
        Rectangle b = new Rectangle(3.5,35.9);
        System.out.println("The width is " + b.getWidth());
        System.out.println("The length is " + b.getLength());
        System.out.println("The area is " + b.getArea());
        System.out.println("The perimeter is " + b.getPerimeter());
        System.out.println(b.toString());




    }
}
