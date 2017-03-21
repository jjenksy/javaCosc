package cs2.assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * 2.	Write a Java program named CircleZapper that displays a circle with a radius of 10 pixels,
 * filled with a random color at a random location on the screen. When you click the circle,
 * it disappears and a new random color circle is displayed at another random location (see display below).
 * After twenty circles are clicked, display the time spent in the pane. To detect whether a point is
 * inside the circle, use the contains method defined in the Node class. You can capture the initial
 * starting time with a statement like:
 * todo finish the timer implementation
 */

public class CircleZapper extends Application {

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

                if (circleCount < 19) {
                    circleCount++;
                    count.setText(circleCount + "");

                    updateCircle(c);
                } else {

                    pane.getChildren().remove(c);
                    pane.getChildren().add(new Text(width / 2, height / 2, "Time spent is milliseconds"));
                }
            });
            primaryStage.setScene(new Scene(pane, width, height));
            primaryStage.setTitle("Game: eye-hand coordination");
            primaryStage.show();
        }

        public static void main(String[] args) {
            Application.launch(args);
        }

        private void updateCircle(Circle c) {

            double min = c.getRadius() + 5;
            double max = 500 - c.getRadius() - 5;

            c.setCenterX((Math.random() * (max - min) + min));
            max = 500
                    - c.getRadius() - 5;
            c.setCenterY((Math.random() * (max - min) + min));

            c.setFill(new Color(Math.random(), Math.random(), Math.random(), 1));
        }


    }