package cs1.Collections;

/**
 * Created by jjenkins on 11/4/2016.
 * This class shows usage Java generics
 */
public class SortedPair<T extends Comparable<T>>  {

    private T first;
    private T second;

    public SortedPair(T left, T right){
        //compareTo returns a negative value if less then 0
        if(left.compareTo(right)<0){
            first = left;
            second = right;
        }
        else {
            first = right;
            second = left;
        }

    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
