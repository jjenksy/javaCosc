package cs2.finalExam;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;


/**
 * Created by jenksy on 5/9/17.
 */

public class Test {
    public static void main(String[] args) {
        IntegerProperty d1 = new SimpleIntegerProperty(1);
        IntegerProperty d2 = new SimpleIntegerProperty(2);
        d1.bindBidirectional(d2);
        System.out.print("d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());
        d1.setValue(3);
        System.out.println(", d1 is " + d1.getValue()
                + " and d2 is " + d2.getValue());
    }
}