package Final;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jjenkins on 1/12/2017.
 */
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> list = new ArrayList<>();

        while (n>0){
            list.add(input.next());
            n--;
        }


        for (int i = 0; i < list.size(); i++) {
            shitPrinter(list.get(i));
            if((!list.isEmpty())){
                System.out.println();
            }
        }






    }


    public static void shitPrinter(String stringName){
        for (int i =0; i< stringName.length(); i++){
            if(i==0){
                System.out.print(stringName.charAt(i));
            }else if(i%2 == 0){
                System.out.print(stringName.charAt(i));
            }
        }

        System.out.print (" ");

        for (int i =0; i< stringName.length(); i++){
            if(!(i%2==0)){
                System.out.print(stringName.charAt(i));
            }

        }

    }
}
