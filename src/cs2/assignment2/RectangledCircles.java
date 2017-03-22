package cs2.assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

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
public class RectangledCircles extends Application{
    private Circle circleToRemove;

    public Circle getCircleToRemove() {
        return circleToRemove;
    }

    public void setCircleToRemove(Circle circleToRemove) {
        this.circleToRemove = circleToRemove;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        double width = 500;
        double height = 500;


        Pane root = new Pane();


        root.addEventFilter(MouseEvent.MOUSE_PRESSED, e -> {

            if( e.isPrimaryButtonDown() && e.isSecondaryButtonDown()) {
                System.out.println( "Both down");
            } else if( e.isPrimaryButtonDown()) {
//                root.getChildren().remove(c);
                root.getChildren().add(updateCircle(new Circle(0,0,10), e));
            } else if( e.isSecondaryButtonDown()) {
                root.getChildren().forEach(circle ->{
                    if(circle.contains(e.getX(),e.getY())){
                        //added the ability to set the item to remove so we would not get a concurrent modification exception
                        setCircleToRemove((Circle) circle);
                    }
                });
                //get the component to be removed and remove it
                root.getChildren().remove(getCircleToRemove());

            }

        });
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.setTitle("RectangledCircles");
        primaryStage.show();
    }


    private Circle updateCircle(Circle c, MouseEvent event) {
        //give the circle a random different color
        c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
        c.setCenterX(event.getX());
        c.setCenterY(event.getY());

        return c;
    }

}
