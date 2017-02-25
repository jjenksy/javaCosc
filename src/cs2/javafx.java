package cs2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by jenksy on 2/25/17.
 */
public class javafx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btOK = new Button("OK");

        Scene scene = new Scene(btOK,200, 250);

        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
