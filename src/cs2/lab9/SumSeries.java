package cs2.lab9;

/**
 * * John Jenkins
 * 04/16/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 9 Hw9
 * Due Date: Moday, April 17, 2017
 * Created by jenksy on 4/14/17.
 *(Sum series) Write a recursive method to compute the following series:
 * m(i) = 1/3 +2/5 + 3/7 + 4/9 + /5/11 + 6/13 + ……. + i/(2i + 1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class SumSeries {

    public static void main(String args[]){
        for (int i =1; i<=10; i++){
            System.out.println(sumSeries(i));
        }
    }

    public static double sumSeries(int n) {

        if (n == 1){
            return 1.0 / 3;//base case
        }{
            return sumSeries(n - 1) + n / (2.0 * n + 1);//recursive
        }

    }

}
