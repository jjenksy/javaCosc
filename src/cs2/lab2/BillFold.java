package cs2.lab2;

/**
 * John Jenkins
 * 02/07/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 2 Hw2
 * Due Date: Tuesday, February 7, 2017
 * The BillFold class takes in two card instances
 * has a method to format the output, getExpiredCount and add Card
 */
public class BillFold {
    //instance methods of the parent class that represent dynamic binding of polymorphism
    private Card card1;//holds the first card instance
    private Card card2;//holds the second card instance

    /**
     * No arg contructor
     */
    public BillFold() {
    }

    /**
     * addCard adds a card to the null card slot
     * @param card the card to be added
     */
    public void addCard(Card card){
        if (card1 == null){
            card1=card;
        }else if(card2 == null){
            card2 = card;
        }
    }


    /**
     * formatCards is a method that displays the format of both card types
     * @return
     */
    public String formatCards(){
        return "["+ card1.format() +" | " + card2.format()+"]";
    }


    /**
     * getExpiredCardCount checks to see if the card is expired and returns the current count
     * @return
     */
    public int getExpiredCardCount(){
        int count = 0;
        if(card1.isExpired()){
            count++;
        }
        if(card2.isExpired()){
            count++;
        }
        return count;
    }
}
