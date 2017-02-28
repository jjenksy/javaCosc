package cs2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Created by jenksy on 2/25/17.
 */
public class javafx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //create a color object
        Color color = new Color(0.25, 0.14, 0.333, 0.51);
        //create new fonts
        Font font1 = new Font("SansSerif", 16);
        Font font2 = Font.font("Times New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, 12);
        //create a button
        Button btOK = new Button();
        //create a circle
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(color);
        circle.setFill(Color.ALICEBLUE);

        btOK.setText("Say, Hello World");
        btOK.setOnAction(event -> {
            System.out.println("hello from button.");
        });

        StackPane root = new StackPane();
        root.getChildren().add(circle);
        root.getChildren().add(btOK);
        Scene scene = new Scene(root,200, 250);

        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
