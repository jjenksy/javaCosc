package cs2.assignment2;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by jenksy on 3/31/17.
 */
public class Coffee {
    private boolean full;
    private int ounces;
    private String coffeeType;

    public Coffee(boolean full, int ounces, String coffeeType) {
        this.full = full;
        this.ounces = ounces;
        this.coffeeType = coffeeType;
    }

    public void drink(){
        this.full=false;
        this.ounces--;

    }

    InputStream inputStream;
    OutputStream outputStream;
}
