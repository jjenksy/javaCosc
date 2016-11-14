package chapter9Classes;

/**
 * Created by jjenkins on 11/14/2016.
 */
public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString(){
        if(on){
            return "A " + radius + " inch " + color +" fan at a speed of "+ speed;
        }else {
            return "A " + radius + " inch " + color +" fan; fan is off";
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main (String [] args){
        Fan a = new Fan();
        Fan b = new Fan();

        a.setSpeed(3);
        a.setRadius(10.0);
        a.setColor("yellow");
        a.setOn(true);

        b.setRadius(5.0);
        b.setOn(false);

        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}
