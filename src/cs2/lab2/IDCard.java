package cs2.lab2;

import java.util.Objects;

/**
 * Created by jjenkins on 2/6/2017.
 */
public class IDCard extends Card {
    private String idNumber;

    /**
     * Default no arg constructor
     */
    public IDCard() {
    }

    /**
     * Constructor that takes two args
     * @param n
     * @param id
     */
    public IDCard(String n, String id) {
        super(n);
        this.idNumber = id;
    }


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
