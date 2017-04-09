package cs2;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * Created by jenksy on 2/25/17.
 */
public class Test {
    public static void main(String[] args) {

        Text text = new Text();
        EventHandler<ActionEvent> eventHandler = e -> {
            if (text.getText().equals("Green")) {
                text.setText("Red");
                text.setFill(Color.RED);
            } else {
                text.setText("Green");
                text.setFill(Color.GREEN);
            }
        };

        // Create an animation for alternating text
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(5000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation

        
    }
}
