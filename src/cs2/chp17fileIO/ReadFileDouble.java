package cs2.chp17fileIO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by jenksy on 4/8/17.
 */
public class ReadFileDouble {

    public static void main(String[] args){

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("text.txt"))) {


            while (dataInputStream.available() > 0){
                dataInputStream.readDouble();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
