package cs2.assignment2;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Created by jjenkins on 3/21/2017.
 * 3.	Write a Java program named MovingText that displays a moving text string.
 * The text string moved from left to right. When it disappears in the right,
 * it reappears from the left. The text freezes when the mouse is pressed and moves again,
 * when the button is released. If the pane in which the text moves is increased in size,
 * the text should adjust and travel the entire horizontal path of the new space.
 * todo implement left to right movement
 */
public class MovingText extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        double width = 400;
        double height = 400;
        Scene scene = new Scene(pane, width, height);
        double radius = Math.min(width, height) * 0.25;
        Circle c = new Circle(width / 2, height / 2, radius, Color.TRANSPARENT);
        Line line = new Line();
        line.setFill(Color.BLACK);//todo fix the line to be follow
        line.setEndX(50);
        line.setEndY(100);
        c.setRotate(180);
        c.setStroke(Color.BLACK);
        Text text = new Text("Programming is fun");

        PathTransition pathTrans = new PathTransition(Duration.millis(10000), line, text);
        pathTrans.setCycleCount(Timeline.INDEFINITE);
        pathTrans.play();


        pane.setOnMousePressed(e-> {
            pathTrans.pause();

        });
        pane.setOnMouseReleased(e-> {
            pathTrans.play();

        });

        pane.getChildren().addAll(text);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Programming is fun");
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
