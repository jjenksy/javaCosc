package cs2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by jenksy on 2/25/17.
 */
public class javafx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btOK = new Button();
        btOK.setText("Say, Hello World");
        btOK.setOnAction(event -> {
            System.out.println("hello from button.");
        });

        StackPane root = new StackPane();
        root.getChildren().add(btOK);
        Scene scene = new Scene(root,200, 250);

        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
