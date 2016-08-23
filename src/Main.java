/**
 * COSC 1173 Programming Lab
 * Name: John Jenkins
 * Data: 8/23/2016
 * Display personal information
 */
public class Main {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {


        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
        add("Hello World!");
        add("Test branch added!");
        add("Hello World!");

}

    /**
     * @add takes in a string and outputs it to the console
     * @param a String argument to be logged to the console.
     */
    public static void add(String a)
    {
        System.out.println(a);

    }
}
