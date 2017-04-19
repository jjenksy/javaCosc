package cs2.lab8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *  *  *John Jenkins
 * 04/09/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 8 Hw8
 * Due Date: Sunday, April 9, 2017
 * Created by jenksy on 4/8/17.
 * (Split files) Suppose you want to back up a huge file (e.g., a 10-GB AVI file) to a CD-R.
 You can achieve it by splitting the file into smaller pieces and backing up these pieces
 separately. Write a utility program that splits a large file into smaller ones using the following
 command:
 java Exercise17_10 SourceFile numberOfPieces
 The command creates the files SourceFile.1, SourceFile.2, . . . , SourceFile.n, where n is
 numberOfPieces and the output files are about the same size
 */
public class SplitFiles {
    public static void main(String[] args) {
        //check to make sure args were passed
        if (args.length != 2) {
            System.exit(0);
        }

        // Get the number of pieces
        int pieces = Integer.parseInt(args[1]);

        // Create an array of random access files
        RandomAccessFile[] splits =
                new RandomAccessFile[pieces];

        try (RandomAccessFile inout = new RandomAccessFile(args[0], "r")) {
            // Add files to array
            for (int i = 0; i < splits.length; i++) {
                splits[i] = new RandomAccessFile(args[0] + "." + (i + 1), "rw");
            }
            int size = Math.round(inout.length() / pieces);
            int count = 0; // Count number of pieces written
            byte[] b;

            for (int i = 0; i < pieces - 1; i++) {
                inout.seek(count * size);
                b = new byte[size];
                inout.read(b);
                splits[i].write(b);
                count++;
            }
            inout.seek(count * size);
            b = new byte[(int)inout.length() - (count * size)];
            inout.read(b);
            splits[pieces - 1].write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
