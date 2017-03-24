package cs2.lab7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 **John Jenkins
 * 03/24/2017
 * COSC 1174-048
 *  Instructor: Kami Makki, Ph.D.
 * Lab 7 Hw7
 * Due Date: Monday, March 27, 2017
 * (Game: eye-hand coordination) Write a program that displays a circle of
 radius 10 pixels filled with a random color at a random location on a pane, as shown
 in Figure 15.29b. When you click the circle, it disappears and a new random color
 circle is displayed at another random location. After twenty circles are clicked,
 display the time spent in the pane, as shown in Figure 15.29c.

 */
public class EyeHandCordination extends Application {
    static int circleCount = 0;

    @Override
    public void start(Stage primaryStage) {

        double width = 500;
        double height = 500;

        Circle c = new Circle(0, 0, 10);
        updateCircle(c);
        Pane pane = new Pane(c);
        Text count = new Text(50,50,circleCount + "");
        pane.getChildren().add(count);
        Long startTime = System.currentTimeMillis();

        c.setOnMouseClicked(e-> {
            //method to determine what was clicked and update
            circleDataFilter(width, height, c, pane, count, startTime);
        });
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Eye Hand Cordination");
        primaryStage.show();
    }

    /**
     * This method determines if the game is over by monitoring the count
     * @param width scene width
     * @param height scene height
     * @param c the targeted circle
     * @param pane the pane for adding and removing circles
     * @param count the count of circles
     */
    private void circleDataFilter(double width, double height, Circle c, Pane pane, Text count, Long startTime) {
        if (circleCount < 19) {
            circleCount++;
            count.setText(circleCount + "");

            updateCircle(c);
        } else {
//            when we ar done
            circleCount++;
            count.setText(circleCount + "");
            pane.getChildren().remove(c);
            Long timeSpent =System.currentTimeMillis() - startTime;
            pane.getChildren().add(new Text(width / 2, height / 2, "Time spent is milliseconds " + timeSpent));
        }
    }

    /**
     * This method is used to create circles of random color when the pane is clicked
     * @param c tje cicle obj
     */
    private void updateCircle(Circle c) {

        double min = c.getRadius() + 5;
        double max = 500 - c.getRadius() - 5;

        c.setCenterX((Math.random() * (max - min) + min));
        max = 500
                - c.getRadius() - 5;
        c.setCenterY((Math.random() * (max - min) + min));

        c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
    }

    public static void main(String[] args) {
        Application.launch(args);
    }



}
