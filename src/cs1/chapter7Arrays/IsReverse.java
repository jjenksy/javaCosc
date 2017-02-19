package cs1.chapter7Arrays;

/**
 * Created by jjenkins on 10/11/2016.
 * Write a def of a method is reverse returns true if and only if one array is reverse of the other
 */
public class IsReverse {
    public static void main(String args[]){
       System.out.println(isReverse(new int[]{1,2,3}, new int[]{4,2,1}));
    }
    public static boolean isReverse(int[] one , int[] two){
        boolean result = true;
        for(int i =0; i < one.length; i++){
            if(one[i] != two[two.length - i -1]){
                result =false;
            }
        }

        return result;
    }
}
