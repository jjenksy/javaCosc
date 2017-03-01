package cs2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by jjenkins on 3/1/2017.
 */
public class ShowFlowPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();//create a flow pane with default horizontal layout
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);

        //place nodes
        pane.getChildren().addAll(new Label("First Name:"),
                new TextField(), new Label("MI:"));
        TextField tfMI = new TextField();
        tfMI.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMI, new Label("Last Name:"),
                new TextField());


        //create a scene and place it on the stage
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
