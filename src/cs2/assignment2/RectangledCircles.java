package cs2.assignment2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

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
    Pane pane = new Pane();//pane object
    ArrayList<Circle> mCircles = new ArrayList<>();

    private Circle circleToRemove;

    public Circle getCircleToRemove() {
        return circleToRemove;
    }

    public void setCircleToRemove(Circle circleToRemove) {
        this.circleToRemove = circleToRemove;
    }
    @Override
    public void start(Stage primaryStage) {

        double width = 600;
        double height = 400;
        // VBox
        VBox infoVBox = new VBox();
        infoVBox.setPadding(new Insets(5, 5, 5, 5));
        infoVBox.setStyle("-fx-border-color: black");

        Label info1 = new Label("INSTRUCTION");
        Label info2 = new Label("Add: Left Click");
        Label info3 = new Label("Remove: Right Click");

        infoVBox.getChildren().addAll(info1, info2, info3);
        Pane infoPane = new Pane(infoVBox);
        infoPane.setPadding(new Insets(10, 10, 10, 10));

        // Pane
        pane.getChildren().addAll(infoPane);
        infoVBox.setLayoutX(10);
        infoVBox.setLayoutY(10);

        pane.setOnMouseClicked(e-> {
            double x = e.getX();
            double y = e.getY();
            //so we do not create them on top of each other
            if (infoPane.contains(x, y)) return;
            //if the button is primary right click
            if (e.getButton() == MouseButton.PRIMARY) {
                Circle c = createCircle(x,y);
                mCircles.add(c);
                pane.getChildren().add(c);
                drawMinBoundingRec();
            //if the mouse is secondary left clicked
            } else if (e.getButton() == MouseButton.SECONDARY) {
                removeCircle(x, y);
                drawMinBoundingRec();

            }

        });

        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("click to draw circle");
        primaryStage.show();
    }

    /**
     * Create a circle and fill it with random colors
     * @param x the x value of the location
     * @param y the y value of the location
     * @return the created circle
     */
    private Circle createCircle(double x, double y) {
        Circle c = new Circle(x, y, 10);
        c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
        return c;
    }
    private void drawMinBoundingRec() {

        removeRec(); // removes old rec

        if (mCircles.size() == 0) return;

        // assume first circle is the current bounding limit
        Circle top = mCircles.get(0);
        Circle bottom = mCircles.get(0);
        Circle right = mCircles.get(0);
        Circle left = mCircles.get(0);
        // get lowest x,y and get highest x,y
        for (Circle c : mCircles) {
            if (c.getCenterX() < left.getCenterX()) left = c;
            if (c.getCenterX() > right.getCenterX()) right = c;
            if (c.getCenterY() > bottom.getCenterY()) bottom = c;
            if (c.getCenterY() < top.getCenterY()) top = c;
        }
        // all circles have the same radius
        double width = right.getCenterX() - left.getCenterX() +  top.getRadius() * 2;
        double height = bottom.getCenterY() - top.getCenterY() +  top.getRadius() * 2;
        double centerX = (right.getCenterX() + left.getCenterX()) / 2;
        double centerY = (top.getCenterY() + bottom.getCenterY()) / 2;

        Rectangle rec = new Rectangle(centerX - width / 2, centerY - height / 2, width, height);
        rec.setStroke(Color.BLACK);
        rec.setFill(Color.TRANSPARENT);
        pane.getChildren().add(rec);

    }
    private void removeCircle(double x, double y) {
        pane.getChildren().forEach(circle-> {
            if (circle instanceof Circle && circle.contains(x, y)) {
                setCircleToRemove((Circle) circle);

            }
        });
        pane.getChildren().remove(getCircleToRemove());
        mCircles.remove(getCircleToRemove());
    }

    private void removeRec(){
        ObservableList<Node> list = pane.getChildren();

        for (Node c : list) {
            if (c instanceof Rectangle) {
                pane.getChildren().remove(c);

                break;
            }
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
