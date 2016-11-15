package chapter9Classes;

/**
 * Created by jjenkins on 11/14/2016.
 */
public class Rectangle {
    private double width;
    private double length;

    //default final values to avoid using magic numbers
    public static final int DEFAULT_WIDTH =1;
    public static final int DEFAULT_LENGTH =1;
    public static final int NON_NEGATIVE = 0;
    /**
     * Default no-arg constructor
     */
    public Rectangle() {
        //set a default values by calling the constructor with 2 args
        this(DEFAULT_WIDTH,DEFAULT_LENGTH);
    }
    // constructor with parameter
    public Rectangle(double width, double length) {
        //todo check to insure positive
        this.width = width;
        this.length = length;
    }

    //setters/accessors
    /** set width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Set length */
    public void setLength(double length) {
        this.length = length;
    }

    //getters/mutators
    /** Return width */
    public double getWidth() {
        return width;
    }
    /** Return length */
    public double getLength() {
        return length;
    }

    /** Return area */
    public double getArea(){
        return length *width;
    }
    /** Return perimeter */
    public double getPerimeter(){
        return 2*(length +width);
    }

    /**
     * Print out the data to the console
     */
    public void RestangleToString(String name){
        System.out.println("The area of "+name + " "  + width +" x " +length+" Rectangle is " +getArea());
       System.out.println("The perimeter of a "+name + " " + width +" x " + length+" Rectangle is " + getPerimeter());

    }




}

