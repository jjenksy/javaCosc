package cs2.Lab1_hw1;

/**
 * Created by jjenkins on 1/26/2017.
 */
public class Ticket {
    public static char DEFAULT_SERVICE = 'B';
    private double price;
    private char service;

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
        if(service != 'A' || service != 'B'){
            this.service = Ticket.DEFAULT_SERVICE;
        }else{
            this.service = service;
        }
    }

    /**
     * swithService method
     * Switches between the two types of services
     */
    public void switchService(){
        if(getService() == 'A'){
            setService('B');
        }else {
            setService('A');
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
        float taxRate = 0.06f;
        Ticket myTicket = new Ticket(20.99, 'C');
        double myTax = myTicket.tax(taxRate);
        System.out.println("The ticket price is "+ myTicket.getPrice());
        System.out.println("The ticket service is "+ myTicket.getService());
        System.out.println("The ticket tax owed is "+ myTax);
        System.out.println("The default service is "+ myTicket.DEFAULT_SERVICE);
        System.out.println("The toString method output is " + myTicket.toString());
    }
}
