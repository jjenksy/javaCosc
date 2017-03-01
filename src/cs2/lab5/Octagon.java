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
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{


    //the var for my side
    private int side;
    /**
     * The constructor with args that set the side of the Octagon
     * @param side the side
     */
    public Octagon(int side) {
        this.side = side;
    }
    //the getter
    public int getSide() {
        return side;
    }

    /**
     * The get area method Overriden from Geometric Object
     * @return the calculated area
     */
    @Override
    public double getArea() {
        return (2 + 4/22)* side * side;
    }

    /**
     * The get perimeter method Overriden from Geometric Object
     * @return the perimeter
     */
    @Override
    public double getPerimeter() {
        return 8*side;
    }

    /** Override the protected clone method defined in
     the Object class, and strengthen its accessibility */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * The compareTo method overriden from Java.lang.object
     * @param o the octogan to compare
     * @return 1 if the current instances getArea is higher
     * -1 if the current intances getArea is lower
     * 0 if equal
     */
    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        }
        else if (getArea() < o.getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }


}
