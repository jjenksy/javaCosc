package cs2.finalExam;

/**
 * Created by jenksy on 5/9/17.
 * Write a recursive method named reverseDisplay that displays an int value reversely on the console using the following method header:

 public static void reverseDisplay(int value)

 For example, reverseDisplay(12345) displays 5 4 3 2 1.
 */
public class ReverseDisplay {


    public static void reverseDisplay(int value){
        if (value <= 0){
            return;
        }
        System.out.print(value % 10);
        reverseDisplay(value / 10);
    }


    public static void main(String[] args){
        reverseDisplay(12345);
    }

}
