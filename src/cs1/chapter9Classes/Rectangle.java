package cs1.chapter9Classes;

/**
 * * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 11/18/2016
 * Refer to the example code of the Circle class in Chapter 8.2, design a class named Rectangle to
 * represent a rectangle. The class contains:
 * Two double data fields named width and length that specify the width and length of the
 * rectangle. The default values are 0.0 for both width and length.
 * A no-arg constructorthat creates a default rectangle.
 * A constructor that creates a rectangle with the specified width and length.
 * A method named getArea() that returnsthe area of this rectangle.
 * A method named getPerimeter() that returnsthe perimeter.
 * Accessor and Mutator methodsfor length and width;
 * Make sure that your constructors and mutator methods can check the new length and width to make
 * sure only positive values can be used in your code, otherwise print out error message to the user.
 */
public class Rectangle {
    //private varibles
    private double width;
    private double length;

    //default final values to avoid using magic numbers
    public static final int DEFAULT_WIDTH =0;
    public static final int DEFAULT_LENGTH =0;
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

        //check to see if length and width ar not negative
        if(width > 0 && length > 0){
            this.width = width;
            this.length = length;
        }else{
            System.out.println("The width and length cannot be negative the default is set to width "+DEFAULT_WIDTH+
            " length " + DEFAULT_LENGTH);
        }

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





}

