package cs2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by jjenkins on 3/4/2017.
 */
public class Test extends Application{


    private double paneWidth = 200;
    private double paneHeight = 90;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circleRed = new Circle(paneWidth / 2, 20, 10);
        Circle circleYellow = new Circle(paneWidth / 2, 50, 10);
        Circle circleGreen = new Circle(paneWidth / 2, 80, 10);
        circleRed.setStroke(Color.BLACK);
        circleYellow.setStroke(Color.BLACK);
        circleGreen.setStroke(Color.BLACK);
        circleRed.setFill(Color.WHITE);
        circleYellow.setFill(Color.WHITE);
        circleGreen.setFill(Color.WHITE);

        Rectangle rectangle = new Rectangle(paneWidth / 2 - 15, 5, 30, 90);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        pane.getChildren().addAll(rectangle, circleRed, circleYellow, circleGreen);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);

        // *** Insert your code here to create the three radio buttons (representing Red, Green, and Yellow), put
        // ***  them in ToggleGroup, add them to a Horizonzontal Pane, centered, and place that in the bottom region
        // *** of borderpane.



        ToggleGroup group = new ToggleGroup();
        RadioButton rdbRed = new RadioButton("Red");
        rdbRed.setToggleGroup(group);
        RadioButton rdbYellow = new RadioButton("Yellow");
        rdbYellow.setToggleGroup(group);
        RadioButton rdbGreen = new RadioButton("Green");
        rdbGreen.setToggleGroup(group);

        HBox paneForRadioButtons = new HBox(20);
        paneForRadioButtons.getChildren().addAll(rdbRed,rdbYellow,rdbGreen);
        borderPane.setBottom(paneForRadioButtons);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, paneWidth, paneHeight + 40);
        primaryStage.setTitle("StopLight"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        // Insert your code here to program the actions that take place when the radio buttons are clicked. There are
        // three action events, one for each radio button. Remember only one of the lights on the stoplight should be
        // colored at a time.

        rdbRed.setOnAction(e -> {
          if (rdbRed.isSelected()) {
              circleRed.setFill(Color.RED);
              circleGreen.setFill(Color.WHITE);
              circleYellow.setFill(Color.WHITE);
          }
        });

        rdbYellow.setOnAction(e -> {
            if (rdbYellow.isSelected()) {
                circleYellow.setFill(Color.YELLOW);
                circleRed.setFill(Color.WHITE);
                circleGreen.setFill(Color.WHITE);
            }
        });

        rdbGreen.setOnAction(e -> {
            if (rdbGreen.isSelected()) {
                circleGreen.setFill(Color.GREEN);
                circleYellow.setFill(Color.WHITE);
                circleRed.setFill(Color.WHITE);
            }
        });
    }

}
