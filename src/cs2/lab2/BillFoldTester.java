package cs2.lab2;

/**
 * Created by jjenkins on 2/6/2017.
 * This is a test class for my BillFold class
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
