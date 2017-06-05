package cs2.recursion;

import java.io.File;
import java.util.Scanner;

/**
 * Created by jjenkins on 4/11/2017.
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "james";
        String str2 = "james";
        String str3 = new String("james");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }

}

