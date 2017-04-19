package cs2.assignment3;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *  *John Jenkins
 * 04/13/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Programming Assignment 3
 * Created by jjenkins on 4/13/2017.
 * 2.	Write a Java program named ColorChanger that uses scroll bars or sliders to select the color for a text string as shown below.
 * Four horizontal scroll or slider bars are used for selecting the colors: red, green, blue, and opacity percentages.
 * Choose a font and text size so that you can clearly see the colors changing.
 */
public class ColorChanger extends Application {

    @FXML
    public Label showColorsLabel;
    @FXML
    public Slider redSlider;
    @FXML
    public Slider greenSlider;
    @FXML
    public Slider blueSlider;
    @FXML
    public Slider opacitySlider;

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        //get the color and set the initial
        ColorOpacityScale color = new ColorOpacityScale(0,0,0,1);
        redSlider.setMax(255);
        // Handle Slider value change events.
        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider Value Changed (newValue: " + newValue.intValue() + ")\n");
            color.setRed(newValue.intValue());
            showColorsLabel.setTextFill(Color.rgb(color.getRed(),color.getGreen(),color.getBlue(),color.getOpacity()));
        });
        greenSlider.setMax(255);
        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider Value Changed (newValue: " + newValue.intValue() + ")\n");
            color.setGreen(newValue.intValue());
            showColorsLabel.setTextFill(Color.rgb(color.getRed(),color.getGreen(),color.getBlue(),color.getOpacity()));
        });
        blueSlider.setMax(255);
        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider Value Changed (newValue: " + newValue.intValue() + ")\n");
            color.setBlue(newValue.intValue());
            showColorsLabel.setTextFill(Color.rgb(color.getRed(),color.getGreen(),color.getBlue(),color.getOpacity()));
        });
        opacitySlider.setMax(1);
        opacitySlider.setValue(1);
        opacitySlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Slider Value Changed (newValue: " + newValue.doubleValue() + ")\n");
            color.setOpacity(newValue.doubleValue());
            showColorsLabel.setTextFill(Color.rgb(color.getRed(),color.getGreen(),color.getBlue(),color.getOpacity()));
        });

    }



    @Override
    public void start(Stage primaryStage) throws Exception {

        //using an fxml file to layout the pane
        Parent root = FXMLLoader.load(getClass().getResource("ColorChanger.fxml"));//the fxml file to use to set up the layout
        primaryStage.setTitle("File Splitter");//title
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}

class ColorOpacityScale{

    private int red;
    private int blue;
    private int green;
    private double opacity;

    public ColorOpacityScale() {
    }

    public ColorOpacityScale(int red, int blue, int green, double opacity) {
        this.red = red;
        this.blue = blue;
        this.green = green;
        this.opacity = opacity;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }
}
