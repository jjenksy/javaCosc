package cs2.chp17fileIO;

/**
 * Created by jenksy on 4/8/17.
 */
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("t.txt")); ) {
            BufferedInputStream input1 =
                    new BufferedInputStream(new FileInputStream("t.dat"));
            DataInputStream input2 = new DataInputStream(
                    new BufferedInputStream(new FileInputStream("t.dat")));

            //uses the random access file constructor
            RandomAccessFile raf = new RandomAccessFile("address.dat","rw");
            //uses the DataOutputStream wrapped on FileOutPutStream
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("address.dat"));

        }
    }
}
