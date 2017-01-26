package cs1.chapter7Arrays;

/**
 * Created by jjenkins on 10/18/2016.
 */
public class Reverses {
    public static void main (String args[]){
        reverse(new int[] {1,2,3});
    }
    public static void reverse(int[] one){


        for(int i =0 ; i<one.length/2; i++){
            int temp = one[i];
            one[i]=one[one.length - i - 1];
            one[one.length - i -1] = temp;
        }

    }
}
