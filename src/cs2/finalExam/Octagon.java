package cs2.finalExam;

import cs2.lab5.GeometricObject;

/**
 * Created by jenksy on 5/9/17.
 * Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal size. The area can be computed using the following formula:
 area = (2 + 4 / sqrt(2)) * side * side
 For the purpose of this exercise, two octagons are equal if their areas are equal.
 Please write the complete class for Octagon including the property(s), the constructor(s) and methods.
 Remember to implement all the required methods for the Comparable and Cloneable interfaces.
 */
public class Octagon extends GeometricObject
        implements Cloneable, Comparable<Octagon> {
    private double side;

    public Octagon() {
    }

    /** Construct a Octagon of a specified side */
    public Octagon(double side) {
        this.side = side;
    }

    //setter for side
    public void setSide(double side) {
        this.side = side;
    }
    //getter for side
    public double getSide() {
        return side;
    }

    /**
     * get area method overridden from Geometric object
     * @return the area of the octagon
     */
    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    /**
     * get perimeter method overridden from Geometric object
     * @return the perimeter of the octagon
     */
    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override /** Override the protected clone in method defined
     in the Object class, and strengthen its accessiblity */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Octagon{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }
}
