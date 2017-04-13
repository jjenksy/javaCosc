package cs2.assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by jjenkins on 4/13/2017.
 * 3.	Suppose you want to back up a huge file to a CD-R.
 * You can do this by splitting the file into smaller pieces and backup up those pieces separately.
 * Write a utility program named FileSplitter that splits a large file into smaller ones. Develop a GUI interface to select the
 * file and the number of smaller files for splitting it up. Below is an example of what such a GUI display might include.
 */
public class FileSplitter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //using an fxml file to layout the pane
        Parent root = FXMLLoader.load(getClass().getResource("FileSplitter.fxml"));
        primaryStage.setTitle("File Splitter");
        primaryStage.setScene(new Scene(root, 400, 200));
        primaryStage.show();
    }




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
