package cs2.lab2;

import java.util.Objects;

/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * THe Id card extends the card class and adds the functionality of having an ID number
 * it overrides the Format, toString and equals method to customize for this instance
 */
public class IDCard extends Card {
    private String idNumber;//the idNumber

    /**
     * Default no arg constructor
     */
    public IDCard() {
    }

    /**
     * Constructor that takes two args
     * @param n the name assigned to the card
     * @param id the id for the card
     */
    public IDCard(String n, String id) {
        super(n);
        this.idNumber = id;
    }

    /**
     * Accessor to get the ID Number
     * @return the id number instance variable
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Creates a String formatted with card holders name and the id number
     * @return String value
     */
    @Override
    public String format() {
        return super.format()+"\n"+
                "Card ID Number: "+ idNumber;
    }


    /**
     * toString this Overridden method return the Class name and all the instance varables and
     * super class variables
     * @return
     */
    @Override
    public String toString() {
        return "IDCard{" +
                "name='" + super.getName() + '\'' +
                "idNumber='" + idNumber + '\'' +
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
        if (!(o instanceof IDCard)) return false;
        if (!super.equals(o)) return false;
        IDCard idCard = (IDCard) o;
        return Objects.equals(idNumber, idCard.idNumber);
    }

}
