package cs1.test2;

/**
 * Created by jjenkins on 11/12/2016.
 */
public class arrays {
    public static void main (String[] args){

        int [] [] scores = { {88, 69, 55, 92}, {75, 45, 93, 40},
                {98, 95, 90, 78}, {91, 84, 7, 6} };

        for (int j = 0; j <= 5; j++) {
            int counter = 1;
            for (int k = 1; k <= j; k++) {
                System.out.print(counter+ " ");
                counter+=2;
            }
            System.out.println();
        }







    }


}
