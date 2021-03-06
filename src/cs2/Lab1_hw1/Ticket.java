package cs2.lab1_hw1;

/**
 * John Jenkins
 * 01/26/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 1 Hw1
 * Due Date: Tuesday, January 31, 2017
 *
 */
public class Ticket {
    public static final char SERVICE_A = 'A'; //the other service that is not default
    public static char DEFAULT_SERVICE = 'B';//default constant Service
    private double price; // the price
    private char service; //the service type

    /**
     * Constructor with arguments
     * @param newPrice the newPrice to set to the price variable
     * @param newService the newService to set to the service variable
     */
    public Ticket( double newPrice, char newService )
    {
        setPrice( newPrice );
        setService( newService );
    }


    /**
     * Accessor method to get the price
     * @return the double price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Mutator method that sets the price
     * if the price is less then Zero its sets the price to 0
     * @param price the price to set
     */
    public void setPrice(double price) {
        if(price<0){
            this.price =0;
        }else{
            this.price = price;
        }
    }

    /**
     * Accessor method to get the Service
     * @return the char Service
     */
    public char getService() {
        return service;
    }

    /**
     * Mutator method to set the service
     * if the service is not A or B then is sets the
     * service to the default serve B
     * @param service
     */
    public void setService(char service) {
        //if 'A' set the service
        if(service == SERVICE_A){
            this.service = service;
        }
        else{
           //default service if not A
            this.service = Ticket.DEFAULT_SERVICE;
        }
    }

    /**
     * switchService method
     * Switches between the two types of services
     */
    public void switchService(){

        if(getService() == SERVICE_A){
            setService('B');
        }else {
            setService(SERVICE_A);
        }
    }

    /**
     * tax method computes the tax that is owed
     * @param rate the float tax rate
     * @return the double tax value owed
     */
    public double tax(float rate){
        return this.getPrice()*rate;
    }

    /**
     * The toString method output the concatanation of service a : and the price
     * @return the concatanated variable
     */
    public String toString(){
        return this.getService()+":"+this.getPrice();
    }

    public static void main(String [] args){
        float taxRate = 0.06f;//taxrate
        //create a new ticket instance
        Ticket myTicket = new Ticket(20.99, 'C');
        //get the tax that will be charged based on the rate
        double myTax = myTicket.tax(taxRate);
        //the test methods
        System.out.println("The ticket price is "+ myTicket.getPrice());
        System.out.println("The ticket service is "+ myTicket.getService());
        System.out.println("The ticket tax owed is "+ myTax);
        System.out.println("The default service is "+ myTicket.DEFAULT_SERVICE);
        System.out.println("The toString method output is " + myTicket.toString());
        myTicket.switchService();
        System.out.println("THe service is now switched to " + myTicket.getService());
    }
}
