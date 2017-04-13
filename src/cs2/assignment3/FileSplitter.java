package cs2.assignment3;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *John Jenkins
 * 04/13/2017
 * COSC 1337
 *Instructor: Keith Mott
 * Programming Assignment 3
 * Created by jjenkins on 4/13/2017.
 * 3.	Suppose you want to back up a huge file to a CD-R.
 * You can do this by splitting the file into smaller pieces and backup up those pieces separately.
 * Write a utility program named FileSplitter that splits a large file into smaller ones. Develop a GUI interface to select the
 * file and the number of smaller files for splitting it up. Below is an example of what such a GUI display might include.
 */
public class FileSplitter extends Application {
    public TextField chooseDir;//Textfield for the chooseDir view
    public TextField numberFiles;//Textfield for the num files view
    private File selectedFile; //the selected fie
    private Stage stage;//the var to hold my stage

    //setter and getters
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public File getSelectedFile() {
        return selectedFile;
    }

    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        setStage(primaryStage);//set the primary stage so we can use it all over the place
        //using an fxml file to layout the pane
        Parent root = FXMLLoader.load(getClass().getResource("FileSplitter.fxml"));//the fxml file to use to set up the layout
        primaryStage.setTitle("File Splitter");//title
        primaryStage.setScene(new Scene(root, 400, 200));
        primaryStage.show();
    }

    /**
     * @chooseDirectory is the callaback funtion that is used when the choose directory text field is clicked
     * @param event the event source object
     */
    public void chooseDirectory(Event event) {
        try {
            setSelectedFile(getFile());
            chooseDir.setText(getSelectedFile().getName().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * THis method to handle the data submission
     * @param event
     */
    public void submit(Event event) {
        try {
            splitFile(getSelectedFile(),Integer.parseInt(numberFiles.getText()));
        } catch (IOException e) {
            e.printStackTrace();
            //show a message if fails
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Failed!");
            alert.setHeaderText("Request failed.");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
        //show a message if completed
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success!");
        alert.setHeaderText("Request complete.");
        alert.setContentText("The new files were created successfully!!");
        alert.showAndWait();
    }

    /**
     * @getFile Opens a dialog on the current stage to access the filechooser
     * @return the chosen file
     * @throws Exception
     */
    public File getFile() throws Exception {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        return fileChooser.showOpenDialog(getStage());
    }

    /**
     * @splitFile this method splits up the chose file
     * @param file the file to split
     * @param numberOfPieces the number of pieces to split into 
     * @throws IOException
     */
    public void splitFile(File file, int numberOfPieces) throws IOException {

        // Create an array of random access files
        RandomAccessFile[] splits =
                new RandomAccessFile[numberOfPieces];

        try (// Create a random access file
             RandomAccessFile inout = new RandomAccessFile(file, "r");
        ) {
            // Add files to array
            for (int i = 0; i < splits.length; i++) {
                splits[i] = new RandomAccessFile(file + "." + (i + 1), "rw");
            }
            int size = Math.round(inout.length() / numberOfPieces);
            int count = 0; // Count number of pieces written
            byte[] b;

            for (int i = 0; i < numberOfPieces - 1; i++) {
                inout.seek(count * size);
                b = new byte[size];
                inout.read(b);
                splits[i].write(b);
                count++;
            }
            inout.seek(count * size);
            b = new byte[(int)inout.length() - (count * size)];
            inout.read(b);
            splits[numberOfPieces - 1].write(b);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }



}
