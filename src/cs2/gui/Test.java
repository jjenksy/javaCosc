package cs2.gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Created by jjenkins on 3/4/2017.
 */
public class Test extends Application{


    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        Pane pane = new Pane();
        StackPane stackPane = new StackPane();
        FlowPane flowPane = new FlowPane();
        GridPane gridPane = new GridPane();
        HBox hBox = new HBox();
        BorderPane borderPane = new BorderPane();
        Button btOK = new Button("OK");
        stackPane.getChildren().add(btOK);
        pane.getChildren().add(btOK);
        flowPane.getChildren().add(btOK);
        gridPane.getChildren().add(btOK);
        hBox.getChildren().add(btOK);
        borderPane.getChildren().add(btOK);
        flowPane.setAlignment(Pos.BASELINE_RIGHT);
        borderPane.getChildren().remove(btOK);
         Scene scene = new Scene(stackPane, 200, 250);
         primaryStage.setTitle("Question 13"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

}
