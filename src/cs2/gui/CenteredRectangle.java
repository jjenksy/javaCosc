package cs2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by jjenkins on 3/23/2017.
 */
public class CenteredRectangle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Insert code here
        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rectangle.heightProperty().bind(primaryStage.heightProperty().subtract(60));
        rectangle.widthProperty().bind(primaryStage.widthProperty().subtract(40));
        rectangle.setX(10);
        rectangle.setY(10);
        pane.getChildren().add(rectangle);
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("CenteredRectangle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
