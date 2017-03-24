package cs2.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by jjenkins on 3/23/2017.
 */
public class UStoCanadianDollars extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        UStoCanadianDollarsCalc calcPane = new UStoCanadianDollarsCalc();

        primaryStage.setScene(new Scene(calcPane, calcPane.getPrefWidth(), calcPane.getPrefHeight()));
        primaryStage.setTitle("Simple calculator");
        primaryStage.show();
    }

    private class UStoCanadianDollarsCalc extends GridPane {

        Label lbUsDollars = new Label("US Dollars:");
        TextField tfUsDollars  = new TextField();


        Label lbCanadaDollars = new Label("Canadian Dollars:");
        TextField tfCanadaDollars = new TextField();

        Button btCalc = new Button("Convert");

        private UStoCanadianDollarsCalc() {

            // Create layout
            setPadding(new Insets(10, 10, 10, 10));
            setAlignment(Pos.CENTER);
            setHgap(10);
            setVgap(10);

            add(lbUsDollars, 0, 0);
            add(tfUsDollars, 1, 0);
            add(lbCanadaDollars, 0, 3);
            add(tfCanadaDollars, 1, 3);

            HBox buttons = new HBox();
            buttons.getChildren().add(btCalc);
            buttons.setAlignment(Pos.BOTTOM_RIGHT);
            add(buttons, 1, 4);
            btCalc.setOnAction(e-> calcFutureValue());

            // Editing TextField settings
            TextField[] textFields = (TextField[])getArray(
                    tfUsDollars, tfCanadaDollars);

            for (TextField tf : textFields) {
                tf.setAlignment(Pos.BASELINE_RIGHT);
            }
            tfCanadaDollars.setDisable(true);

        }

        private Object[] getArray(Object... objects) {
            Object[] temp = new TextField[objects.length];
            for (int i = 0; i < objects.length; i++) {
                temp[i] = objects[i];
            }
            return temp;
        }

        public void calcFutureValue() {
            double investmentAmount = Double.parseDouble(tfUsDollars.getText());

            tfCanadaDollars.setText(String.format("$%.2f", investmentAmount*1.5));
        }
    }
}
