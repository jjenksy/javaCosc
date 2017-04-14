package cs2.lab8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;

/**
 *  *John Jenkins
 * 04/09/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 8 Hw8
 * Due Date: Sunday, April 9, 2017
 * Created by jenksy on 4/8/17.
 * (Address book) Write a program that stores, retrieves, adds, and updates addresses as
 shown in Figure 17.20. Use a fixed-length string for storing each attribute in the address. Use
 random access file for reading and writing an addres
 */
public class AddressBook extends Application {

    protected AddressPane pane = new AddressPane();
    final int NAME = 32;
    final int STREET = 32;
    final int CITY = 20;
    final int STATE = 2;
    final int ZIP = 5;
    protected int count = 0;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create and register handlers
        pane.btAdd.setOnAction(e -> {
            //write to the file
            try (RandomAccessFile inout = new RandomAccessFile("AddressBook.dat", "rw")) {
                inout.seek(inout.length());
                write(inout);
            }
            catch (FileNotFoundException ex) {}
            catch (IOException ex) {}
            catch (IndexOutOfBoundsException ex) {}
        });
        pane.btFirst.setOnAction(e -> {
            //read the button from the file
            try ( // Create a random access file
                  RandomAccessFile inout =
                          new RandomAccessFile("AddressBook.dat", "rw");
            ) {
                if (inout.length() > 0) {
                    inout.seek(0);
                    read(inout);
                    System.out.println("Reading address #1");
                    count = 1;
                }
                else {
                    System.out.println("Address is empty!");
                }
            }
            catch (IOException ex) {}
        });
        pane.btNext.setOnAction(e -> {
            /** Read the next Address from the file */
            try ( // Create a random access file
                  RandomAccessFile inout =
                          new RandomAccessFile("AddressBook.dat", "rw");
            ) {
                if (count * 91 < inout.length()) {
                    inout.seek(count * 91);
                    read(inout);
                    count++;
                    System.out.println("Reading address #" + count);
                }
                else {
                    System.out.println("End of file!");
                }
            }
            catch (IOException ex) {}
        });
        pane.btPrevious.setOnAction(e -> {
            /** Read the previous Address from the file */
            try ( // Create a random access file
                  RandomAccessFile inout =
                          new RandomAccessFile("AddressBook.dat", "rw");
            ) {
                if (count > 1)
                    count--;
                else
                    count = 1;
                inout.seek((count * 91) - 91);
                read(inout);
                System.out.println("Reading address #" + count);
            }
            catch (IOException ex) {}
        });
        pane.btLast.setOnAction(e -> {
            /** Read last address from file */
            try ( // Create a random access file
                  RandomAccessFile inout =
                          new RandomAccessFile("AddressBook.dat", "rw");
            ) {
                count = ((int)inout.length()) / 91;
                inout.seek((count * 91) - 91);
                read(inout);
                System.out.println("Reading address #" + count);
            }
            catch (IOException ex) {}
        });
        pane.btUpdate.setOnAction(e -> {
            /** Edit and address in file */
            try ( // Create a random access file
                  RandomAccessFile inout =
                          new RandomAccessFile("AddressBook.dat", "rw");
            ) {
                inout.seek(count * 91 - 91);
                write(inout);
            }
            catch (FileNotFoundException ex) {}
            catch (IOException ex) {}
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Address Book"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /** Write address to file */
    private void write(RandomAccessFile inout) throws IOException {
        inout.write(fixedLength(pane.tfName.getText().getBytes(), NAME));
        inout.write(fixedLength(pane.tfStreet.getText().getBytes(), STREET));
        inout.write(fixedLength(pane.tfCity.getText().getBytes(), CITY));
        inout.write(fixedLength(pane.tfState.getText().getBytes(), STATE));
        inout.write(fixedLength(pane.tfZip.getText().getBytes(), ZIP));
        System.out.println("Address #" + count + " saved!");
    }

    /** Read address from file */
    private void read(RandomAccessFile inout) throws IOException {
        int pos;
        byte[] name = new byte[NAME];
        pos = inout.read(name);
        pane.tfName.setText(new String(name));

        byte[] street = new byte[STREET];
        pos += inout.read(street);
        pane.tfStreet.setText(new String(street));

        byte[] city = new byte[CITY];
        pos += inout.read(city);
        pane.tfCity.setText(new String(city));

        byte[] state = new byte[STATE];
        pos += inout.read(state);
        pane.tfState.setText(new String(state));

        byte[] zip = new byte[ZIP];
        pos += inout.read(zip);
        pane.tfZip.setText(new String(zip));
    }

    /** Return a byte[] of fixed-length */
    private byte[] fixedLength(byte[] x, int n) {
        byte[] b = new byte[n];
        for (int i = 0; i < x.length; i++) {
            b[i] = x[i];
        }
        return b;
    }

    class AddressPane extends BorderPane {
        protected TextField tfName = new TextField();
        protected TextField tfStreet = new TextField();
        protected TextField tfCity = new TextField();
        protected TextField tfState = new TextField();
        protected TextField tfZip = new TextField();
        protected Button btAdd = new Button("Add");
        protected Button btFirst = new Button("First");
        protected Button btNext = new Button("Next");
        protected Button btPrevious = new Button("Previous");
        protected Button btLast = new Button("Last");
        protected Button btUpdate = new Button("Update");
        private FlowPane paneForInfo = new FlowPane(5, 5);
        private HBox paneForButtons = new HBox(5);

        public AddressPane() {
            drawAddressBook();
        }

        private void drawAddressBook() {
            // Set the column size for each text field
            tfName.setPrefColumnCount(23);
            tfStreet.setPrefColumnCount(23);
            tfCity.setPrefColumnCount(8);
            tfState.setPrefColumnCount(2);
            tfZip.setPrefColumnCount(4);

            // Place nodes in the flow pane
            paneForInfo.setPadding(new Insets(10, 10, 0, 10));
            paneForInfo.getChildren().addAll(new Label("Name"), tfName,
                    new Label("Street"), tfStreet, new Label("City   "), tfCity,
                    new Label("State"), tfState, new Label("Zip"), tfZip);

            // Place nodes in the hbox
            paneForButtons.getChildren().addAll(btAdd, btFirst,
                    btNext, btPrevious, btLast, btUpdate);
            paneForButtons.setAlignment(Pos.CENTER);

            // Place nodes in pane
            setCenter(paneForInfo);
            setBottom(paneForButtons);
        }
    }
}
