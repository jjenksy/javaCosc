package cs2.lab2;

import java.util.Objects;
/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * This CallingCard class extends the Card class. Adding the cardNumber and pin to make a calling card
 * it overides the format, toString and equals methods
 */
public class CallingCard extends Card {
    private String cardNumber;//the card number instance variables
    private String pin; // the pin instance varibles

    /**
     * No arg constructor
     */
    public CallingCard() {
    }

    /**
     * Cunstructor with 3 args
     * @param name the name on tha card
     * @param pin the pin assigned to card
     * @param cardNumber the card number
     */
    public CallingCard(String name, String pin, String cardNumber) {
        super(name);
        this.pin = pin;
        this.cardNumber = cardNumber;

    }

    /**
     * Creates a String formatted with card holders name
     * card number and pin
     * @return String value
     */
    @Override
    public String format() {
        return super.format()+"\n"+
                "Card Number: "+ cardNumber+"\n"
                +"Card Pin: " + pin;
    }

    /**
     * toString this Overridden method return the Class name and all the instance varables and
     * super class variables
     * @return
     */
    @Override
    public String toString() {
        return "CallingCard{" +
                "name='" + super.getName() + '\'' +
                "cardNumber='" + cardNumber + '\'' +
                ", pin='" + pin + '\'' +
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
        if (!(o instanceof CallingCard)) return false;
        if (!super.equals(o)) return false;
        CallingCard that = (CallingCard) o;
        return Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(pin, that.pin);
    }
}
