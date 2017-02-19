package cs2.lab2;

/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 * Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * This is the main method for
 * testing all the functions required to test based on the hwk assigned
 */
public class BillFoldTester {

    public static void main(String[] args){
        BillFold billFold = new BillFold();


        DriverLicense driverLicense = new DriverLicense("John Jenkins", "123456789", 2016);
        //the addCard method is adding an instance of DriverLicense and CallCard
        //which is using Dynamic binding to allow any subclass of Card to bind
        //to Card class
        billFold.addCard(driverLicense);
        billFold.addCard(new CallingCard("John Jenkins","1234","555-555-5555"));

       System.out.println(billFold.getExpiredCardCount());


        //test the CallingCard equals method
        CallingCard card1 = new CallingCard("John Jenkins","1234","555-555-5555");
        CallingCard card2 = new CallingCard("John Jenkins","1234","555-555-5555");
        //test the toString method
        System.out.println(card1.toString());
        //this should be equal
        System.out.println(card1.equals(card2));
        //this should not be equal
        System.out.println(driverLicense.equals(card1));

        //log the cards info. to the console
        System.out.println(billFold.formatCards());
    }
}
