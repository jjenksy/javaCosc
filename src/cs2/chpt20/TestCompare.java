package cs2.chpt20;

import cs2.lab5.GeometricObject;

import java.util.Comparator;

/**
 * Created by johnjenkins on 5/3/17.
 * Testing the comparator iterface which uses Generics and implements
 * the compare method
 */
public class TestCompare implements Comparator<GeometricObject> {


    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea(); double area2 = o2.getArea();
        if (area1 < area2) return -1;
        else if (area1 == area2) return 0;
        else
            return 1;
    }
}
