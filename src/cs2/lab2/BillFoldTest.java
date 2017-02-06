package cs2.lab2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jjenkins on 2/6/2017.
 */
public class BillFoldTest {

    @Test
    public void testAddCard() throws Exception {
        //create a billfold instance
        BillFold billFold = new BillFold();

        DriverLicense driverLicense = new DriverLicense("John Jenkins", "123456789", 2016);
        //the addCard method is adding an instance of DriverLicense and CallCard
        //which is using Dynamic binding to allow any subclass of Card to bind
        //to Card class
        billFold.addCard(driverLicense);
        billFold.addCard(new CallingCard("John Jenkins","1234","555-555-5555"));

        //test to make sure only one card is expired
        Assert.assertEquals(1, billFold.getExpiredCardCount());
        //test to see if drivers license expired is true
        Assert.assertTrue(driverLicense.isExpired());

    }

    @Test
    public void testFormatCards() throws Exception {

    }

    @Test
    public void testGetExpiredCardCount() throws Exception {

    }
}