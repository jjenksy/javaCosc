package cs2.Lab1_hw1.playground;

import java.util.ArrayList;

/**
 * Created by jjenkins on 1/27/2017.
 */
public class Play {

    public Play() {
    }

    public static ArrayList<Integer> numDivides(int num){
        ArrayList<Integer> intArray = new ArrayList<>();
        int base = num;
        while(num>1){
            if(base%num ==0){
                intArray.add(num);
            }
            num--;
        }

        return intArray;
    }



    public static void main(String [] args){
        System.out.println(Play.numDivides(36));
    }
}
