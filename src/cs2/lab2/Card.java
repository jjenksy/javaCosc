package cs2.lab2;

/**
 * Created by jjenkins on 2/6/2017.
 */
public class Card {
    protected String name;

    public Card() {
        name = "";
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isExpired(){
        return false;
    }

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
