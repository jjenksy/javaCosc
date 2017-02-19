package cs2.lab2;

/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * Card class is used as the parent class for creating card class it has a name variable with appropriate getter and default
 * constructor
 */
public class Card {
    protected String name;//the name on the card

    /**
     * No arg default constructor
     */
    public Card() {
        name = "";
    }

    /**
     * Constructor with String name arg to set the name
     * @param name the String name
     */
    public Card(String name) {
        this.name = name;
    }

    /**
     * Accessor to get the name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Boolean to test if card is expired
     * this method is meant to be overridden if
     * implemented
     * @return always false
     */
    public boolean isExpired(){
        return false;
    }

    /**
     * Creates a String formatted with card holders name
     * @return String value
     */
    public String format(){
        return "Card holder: " + name;
    }


    /**
     * toString this Overridden method return the Class name and all the instance varables and
     * super class variables
     */
    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * The equals method checks to see if cards are the same
     * if they belong to the same class and if the name and other information match
     * @return a boolean if true or false othewise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;

        Card card = (Card) obj;

        return getName().equals(card.getName());

    }
}
