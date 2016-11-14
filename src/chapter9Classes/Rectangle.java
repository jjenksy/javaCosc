package chapter9Classes;

/**
 * Created by jjenkins on 11/14/2016.
 */
public class Rectangle {
    private double width = 1;
    private double height =1;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return 2*(height+width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static void main (String [] args){
        Rectangle a = new Rectangle(4.0,40.0);
        System.out.println("The area of a " + a.width +" x " +a.height+" Rectangle is " +a.getArea());
        System.out.println("The perimeter of a " + a.width +" x " +a.height+" Rectangle is " +a.getPerimeter());
        Rectangle b = new Rectangle(3.5, 35.9);
        System.out.println("The area of a " + b.width +" x " +b.height+" Rectangle is " +b.getArea());
        System.out.println("The perimeter of a " + b.width +" x " +b.height+" Rectangle is " +b.getPerimeter());


    }
}

