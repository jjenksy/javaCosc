package cs2.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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




        btOK.setText("Say, Hello World");
        btOK.setOnAction(event -> {
            System.out.println(event.getSource());
        });
        //Write code fragments to create a round-cornered rectangle of width 100 and height 200
        // with the upper-left corner at (10, 10), corner horizontal diameter 40,
        // and corner vertical diameter 20. Set the fill color of the rectangle to GREEN.
        Rectangle r1 = new Rectangle(10, 10, 100, 200);
        r1.setArcWidth(40);
        r1.setArcHeight(20);
        r1.setFill(Color.GREEN);
        Text text = new Text();
        text.setText("John Jenkins");
        text.setStyle("-fx-text-fill: blue");
        text.setFont(Font.font("Arial"));
        text.setUnderline(true);
        text.setRotate(-45);
       // Write code fragments to display the lower half
        // of a circle (arc) with radius 50 filled with the red color.
        // Center it at the point 100,100. Place the Arc in a pane.
        Arc arc = new Arc(100, 100, 50, 50, 0, -180);
        arc.setFill(Color.RED);
        arc.setType(ArcType.ROUND);

        Pane pane = new Pane();
        pane.getChildren().add(btOK);
        Scene scene = new Scene(pane,200, 250);

        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
