package cs2.recursion;

import java.io.File;
import java.util.Scanner;

/**
 * Created by jjenkins on 4/11/2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(
                "Sum is " + xMethod(5));
    }
    public static int xMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }
}

