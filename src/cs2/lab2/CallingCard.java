package cs2.lab2;

import java.util.Objects;

/**
 * Created by jjenkins on 2/6/2017.
 */
public class CallingCard extends Card {
    private String cardNumber;
    private String pin;

    /**
     * No arg constructor
     */
    public CallingCard() {
    }

    /**
     * Cunstructor with 3 args
     * @param name
     * @param pin
     * @param cardNumber
     */
    public CallingCard(String name, String pin, String cardNumber) {
        super(name);
        this.pin = pin;
        this.cardNumber = cardNumber;

    }

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
