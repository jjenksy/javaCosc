package cs2.lab5;

/**
 /**  John Jenkins
 * 03/01/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 5 Hw5
 * Due Date: Wednesday, March 1, 2017
 * 13.11 - (The Octagon class) Write a class named Octagon that extends GeometricObject and
 implements the Comparable and Cloneable interfaces. Assume that all eight sides of the octagon
 are of equal length. The area can be computed using the following formula:
 area = (2 + 4/22)* side * side
 Draw the UML diagram that involves Octagon, GeometricObject, Comparable, and
 Cloneable. Write a test program that creates an Octagon object with side value 5 and displays its
 area and perimeter. Create a new object using the clone method and compare the two objects
 using the compareTo method.
 */
public class GeometricObject {


    public GeometricObject() {
    }

    public double getArea() {
        // Implement it (
        return 3.0;
    }


    public double getPerimeter() {
        // Implement it
        return 6.0;
    }
}
