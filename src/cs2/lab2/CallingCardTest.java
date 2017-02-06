package cs2.lab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jjenkins on 2/6/2017.
 */
public class CallingCardTest {

    @Test
    public void testFormat() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

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