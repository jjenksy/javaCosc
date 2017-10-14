package cs3.assignment1.assignment4;


/**
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
// by diving a big problem into smaller subproblem
// but there will be repetetion in this case as
// same values are coputed multiple time during recursion
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
