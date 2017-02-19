package Final;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jjenkins on 1/12/2017.
 */
public class Solution {

    public static int factorial(int f){
        if(f<=1){
            return 1;
        }else{
            return f * (factorial(f-1));
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);

        int F = input.nextInt();
        System.out.println(factorial(F));

        input.close();
    }
}