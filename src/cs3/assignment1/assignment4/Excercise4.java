package cs3.assignment1.assignment4;


/**
 *  Instructor: Jing Zhang, PhD
 * Programming Assignment 3 Exercise1
 * Created by jenksy on 10/17/17.
 * Find the non-recursive version of the following recursive function. Which version is better?
 static long tough(int x, int y) {
 if (x < y) return tough(y, x);
 else
 if ( y <= 0 ) return 1;
 else {
 if (x > y) return tough(x - 1, y) + tough(x - 1, y - 1);
 else // it means x == y
 return tough(x - 1, y - 1);
 }
 }
 */
public class Excercise4 {


    public static void main(String[] args){
        System.out.println(tough(0, 100000));
    }
    // divide and conquer approach to solve problem
    static long tough(int x, int y)
    {
        if (x < y) return tough(y,x);

        else if (y <= 0) return 1;

        else
        {
            if (x > y)
                return tough(x - 1, y) + tough (x-1, y-1);
            else //it means x == y
                return tough(x-1, y-1);
        }
    }
}
