package Final;

import java.util.*;

/**
 * Created by jenksy on 1/13/17.
 */
public class HashTest {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        // Declare a String to String map
        Map<String, Integer> myMap = new HashMap<>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(myMap.get(s) != null){
                System.out.println(s+"="+myMap.get(s));
            }else{
                System.out.println("Not found");
            }



        }
        in.close();



    }
}
