package cs2.lab7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *John Jenkins
 * 03/24/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 7 Hw7
 * Due Date: Monday, March 27, 2017
 * Created by jjenkins on 3/24/2017.
 *  (Change color using a mouse) Write a program that displays the color of a
 *  circle as black when the mouse button is pressed and as white when the mouse button
 *  is released.
 */
public class ChangeCircleColor extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Circle circle = new Circle();//create a circle
        circle.centerXProperty().bind(pane.widthProperty().divide(2));//bind the center x of the circle
        circle.centerYProperty().bind(pane.heightProperty().divide(2));//bind the center y odf the circle
        circle.setRadius(20);//set the radius of the circle
        circle.setStroke(Color.BLACK);//set the stroke
        circle.setFill(Color.WHITE);//set the initial fill color


        circle.setOnMousePressed(event -> circle.setFill(Color.BLACK));//change the fill when the mouse is pressed
        circle.setOnMouseReleased(event -> circle.setFill(Color.WHITE));//change the fill when mouse is released
        pane.getChildren().add(circle);//add the circle to the pane

        primaryStage.setScene(new Scene(pane, 200, 200));//create a scene add it to the stage and add the pane to it
        primaryStage.setTitle("Change Circle Color");//set the tite
        primaryStage.show();

    }


    public static void main(String[] args){
        Application.launch(args);
    }
}
