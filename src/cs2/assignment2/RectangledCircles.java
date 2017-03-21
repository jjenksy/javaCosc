package cs2.assignment2;

/**
 * Created by jjenkins on 3/21/2017.
 * 4.	Write a Java program named RectangledCircles that enables the user to add and remove points in a two-dimensional plane dynamically. A minimum bounding rectangle is updated as the points are added and removed. Assume that the radius of each point is 10 pixels. Here is an algorithm for the mouse event triggered:
 MousePressed event triggered
 If Primary mouse button pressed
 Create a new circle at the location pressed
 Else if Secondary mouse button pressed
 Get a list of all the circles on the screen
 If current location pressed is inside (use contains method) a circle
 Remove the circle
 End if
 End if

 Get the X and Y coordinates of all the circle centers
 Find the max and min of all X and Y values
 Set the coordinates and length/width of the bounding rectangle according to the min and                         max values

 End mousePressed event

 */
public class RectangledCircles {
}
