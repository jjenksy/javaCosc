package cs2.lab2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jjenkins on 2/6/2017.
 */
public class DriverLicense extends IDCard {
    private int expirationYear;

    /**
     * No arg constructor
     */
    public DriverLicense() {
    }

    /**
     * Constructor with three args
     * @param n
     * @param id
     * @param expirationYear
     */
    public DriverLicense(String n, String id, int expirationYear) {
        super(n, id);
        this.expirationYear = expirationYear;
    }

    @Override
    public String format() {
        return super.format()+"\n"
                +"Expiration Year: "+ expirationYear;
    }

    @Override
    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.YEAR) >= this.expirationYear;
    }

    /**
     * toString this Overridden method return the Class name and all the instance varables and
     * super class variables
     * @return
     */
    @Override
    public String toString() {
        return "DriverLicense{" +
                "name='" + super.getName() + '\'' +
                "expirationYear=" + expirationYear +
                '}';
    }


    /**
     * The equals method checks to see if cards are the same
     * if they belong to the same class and if the name and other information match
     * @return a boolean if true or false othewise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverLicense)) return false;
        if (!super.equals(o)) return false;
        DriverLicense that = (DriverLicense) o;
        return expirationYear == that.expirationYear;
    }
}
