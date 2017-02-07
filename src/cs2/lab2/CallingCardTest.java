package cs2.lab2;

import org.junit.Assert;
import org.junit.Test;
/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * Test class for my calling card class
 */
public class CallingCardTest {


    /**
     * This test passes if the AssertTrue sees true return from the two
     * equal cards and assertFalse returns false from the non equal cards
     * @throws Exception
     */
    @Test
    public void testEquals() throws Exception {
        //test the CallingCard equals method
        CallingCard card1 = new CallingCard("John Jenkins","1234","555-555-5555");
        CallingCard card2 = new CallingCard("John Jenkins","1234","555-555-5555");

        //this should be true since the above instances match
        Assert.assertTrue(card1.equals(card2));

        CallingCard card3 = new CallingCard("John Jenks","1239","555-555-5909");

        //this test should pass if the cards are not equal
        Assert.assertFalse(card1.equals(card3));

    }
}