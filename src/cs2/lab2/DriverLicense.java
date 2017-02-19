package cs2.lab2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * The drivers license class extends the Id card class adding the expiration year and proper implementation
 * of the is expired method
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
     * @param n the nome on the caed
     * @param id the id of the card
     * @param expirationYear the int expiration year (ex: 2017)
     */
    public DriverLicense(String n, String id, int expirationYear) {
        super(n, id);
        this.expirationYear = expirationYear;
    }

    /**
     * Creates a String formatted with card holders name the id number
     * and expiration year
     * @return String value
     */
    @Override
    public String format() {
        return super.format()+"\n"
                +"Expiration Year: "+ expirationYear;
    }

    /**
     * the isExpired method checks to see if the current calendar year is greater or equal
     * to the year entered if the year is greater isExpired = true if the year is less the false
     * @return
     */
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
