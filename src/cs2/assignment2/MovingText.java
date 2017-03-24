package cs2.assignment2;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 *  *  *  * * John Jenkins
 * 03/24/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Programming Assignment 2
 * Created by jjenkins on 3/21/2017.
 * 3.	Write a Java program named MovingText that displays a moving text string.
 * The text string moved from left to right. When it disappears in the right,
 * it reappears from the left. The text freezes when the mouse is pressed and moves again,
 * when the button is released. If the pane in which the text moves is increased in size,
 * the text should adjust and travel the entire horizontal path of the new space.
 */
public class MovingText extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Line line = new Line();
        line.setFill(Color.BLACK);//todo fix the line to be follow
        line.setStroke(Color.BLACK);
        line.setOpacity(1);
        line.startXProperty().bind(pane.widthProperty().divide(pane.widthProperty()));
        line.startYProperty().bind(pane.heightProperty().divide(2));
        line.endXProperty().bind(pane.widthProperty());
        line.endYProperty().bind(pane.heightProperty().divide(2));
        Text text = new Text("Programming is fun");

        Scene scene = new Scene(pane, 400, 400);

        PathTransition pathTrans = new PathTransition(Duration.millis(10000), line, text);
        pathTrans.setCycleCount(Timeline.INDEFINITE);
        pathTrans.play();
//        pathTrans.pathProperty().bind(line);

        pane.setOnMousePressed(e-> {
            pathTrans.pause();


        });
        pane.setOnMouseReleased(e-> {
            pathTrans.play();

        });
        /**
         * Listener for the resizing of the window
         */
        scene.widthProperty().addListener((observable, oldValue, newValue) -> {
            pathTrans.stop();//stop the transition so we can restart with the updated path

            pathTrans.play();//play the trastiion
        });


        pane.getChildren().addAll(text,line);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Programming is fun");
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
