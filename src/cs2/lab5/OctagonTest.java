package cs2.lab5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 /**  John Jenkins
 * 03/01/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 5 Hw5
 * Due Date: Wednesday, March 1, 2017
 * This is the test class for the Octogan class
 */
public class OctagonTest {

    public static final int SIDE = 5;//set a constant for th side
    Octagon octagon;//create a variable for the octagon

    /**
     * THis method is for setup of the new octogan invoking its constructor with the side argument
     */
    @Before
    public void setUp() throws Exception {
        octagon = new Octagon(SIDE);//create the instance of the octagon
    }

    /**
     * This method tests the side we get is equal to the side we expect
     */
    @Test
    public void testGetSide() throws Exception {
        Assert.assertEquals(SIDE, octagon.getSide());
    }


    /**
     * This method test to insure the proper area is returned
     */
    @Test
    public void testGetArea() throws Exception {
        System.out.println(octagon.getArea());
        //assert equals takes the expected values, the actual and a delta
        Assert.assertEquals(50,octagon.getArea(),0);
    }

    /**
     * THis method tests to insure the proper perimeter is returned
     */
    @Test
    public void testGetPerimeter() throws Exception {
        System.out.println(octagon.getPerimeter());
        //assert equals takes the expected values, the actual and a delta
        Assert.assertEquals(SIDE*8,octagon.getPerimeter(),0);
    }

    /**
     * THis method test the Clone and compareTo methods
     */
    @Test
    public void testCloneAndCompareTo() throws Exception {

        //create the clone
        Octagon clonedOctogan = (Octagon) octagon.clone();
        //test that the areas are equal
        Assert.assertEquals(clonedOctogan.getArea(),octagon.getArea(),0);
        System.out.println(octagon.compareTo(clonedOctogan));
        //since we expect the clone to be equal we expect to return zero
        Assert.assertEquals(0,octagon.compareTo(clonedOctogan));
    }

}