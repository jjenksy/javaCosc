package cs2.Lab1_hw1;

/**
 * Created by jjenkins on 1/26/2017.
 */
public class Ticket {
    private double price;
    private char service;
    public Ticket( double newPrice, char newService )
    {
        setPrice( newPrice );
        setService( newService );
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getService() {
        return service;
    }

    public void setService(char service) {
        this.service = service;
    }
}
