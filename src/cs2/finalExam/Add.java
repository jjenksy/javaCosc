package cs2.finalExam;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by jenksy on 5/9/17.
 */
public class Add extends Application {
    protected TextField textField1 = new TextField();
    protected TextField textField2 = new TextField();
    protected TextField result = new TextField();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create three buttons
        Button add = new Button("Add");



        // Create a pane to hold the textfield
        HBox paneForTextField = new HBox(10);
        paneForTextField.getChildren().addAll(new Label("Number 1"), textField1,new Label("Number 2"), textField2,new Label("Result"), result);
        paneForTextField.setAlignment(Pos.CENTER);

        // Create a pane to hold buttons
        HBox paneForButtons = new HBox(5);
        paneForButtons.getChildren().addAll(add);
        paneForButtons.setAlignment(Pos.CENTER);

        // Set text  not editable
        result.setEditable(false);

        // Create a border pane and add nodes to it
        BorderPane pane = new BorderPane();
        pane.setTop(paneForTextField);
        pane.setBottom(paneForButtons);


        // Create and register handles
        add.setOnAction(e -> add()); // add and integer



        // Create a Scene and place it in the stage
        Scene scene = new Scene(pane, 800, 150);
        primaryStage.setTitle("Add"); // Set the stage title
        primaryStage.setScene(scene); // Place a scene in the stage
        primaryStage.show(); // Display the stage
    }

    /** Add an integer to the end of the list */
    private void add() {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());
        result.setText(String.valueOf(num1+num2));
    }


}
