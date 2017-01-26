package cs2.Lab1_hw1;

/**
 * John Jenkins
 * 01/26/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 1 Hw1
 * Due Date: Tuesday, January 31, 2017
 * THe MyInteger class was designed to have
 * An int data field named value that stores the int value represented by this object.
  A constructor that creates a MyInteger object for the specified int value.
  A get method that returns the int value.
  Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or
 prime, respectively.
  Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the
 specified value is even, odd, or prime, respectively.
  Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger)
 that return true if the specified value is even, odd, or prime, respectively.
  Methods equals(int) and equals(MyInteger) that return true if the value in the object
 is equal to the specified value.
  A static method parseInt(char[]) that converts an array of numeric characters to an
 int value.
  A static method parseInt(String) that converts a string into an int value.
 * This is written in Java
 */
public class MyInteger {
    private int value;//the int instance variable that is our main value throughout the program

    /**
     *The constructor with a single argument
     * @param value the in to initialize
     */
    public MyInteger(int value){
        this.value = value;
    }

    /**
     * The assessor method to get the instance variable
     * @return the instance variable
     */
    public int getValue() {
        return value;
    }

    /**
     * Instance method that test if the instance variable value is even
     * @return returns a boolean value
     */
    public boolean isEven(){
        return (value%2)==0;
    }

    /**
     *Instance method that test if the instance variable value is odd
     * @return a boolean
     */
    public boolean isOdd(){
        return (value%2)!=0;
    }

    /**
     * Check to see if the instance variable is prime
     * @return a boolean true if it is prime
     */
    public boolean isPrime(){
        //check if n is a multiple of 2
        if (value%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=value;i+=2) {
            if(value%i==0)
                return false;
        }
        return true;
    }

    /**
     * Method equals takes in  an int value  and tests to see if it is equal to the
     * instance value
     * @param value any integer
     * @return a boolean true if the argument value is equal to the instance variable
     */
    public boolean equals(int value){
        return this.value ==value;
    }

    /**
     * equals method takes in an new instance of the MyInteger class
     * and test to see if the two instances values are equal
     * @param myInteger the new instance of MyInteger
     * @return a boolean true if the new MyInteger value equals the instance variables
     */
    public boolean equals(MyInteger myInteger){
        return equals(myInteger.getValue());
    }

    //static methods

    /**
     * isEven is a static method
     * that takes and int varible and returns true if it is even and
     * false otherwise
     * @param myInteger the arg value
     * @return the boolean that returns true if the int is even
     */
    public static boolean isEven(int myInteger){
        return (myInteger%2)==0;
    }

    /**
     * isEven is a static method
     * that takes a new MyInteger instance and returns true if it is even and
     * false otherwise
     * @param myInteger the new Instance of MyInteger
     * @return the boolean that returns true if the MyInteger is even
     */
    public static boolean isEven(MyInteger myInteger){
        return MyInteger.isEven(myInteger.getValue());
    }

    /**
     * isOdd is a static method
     * that takes an int and returns true if it is odd and
     * false otherwise
     * @param myInteger an int to test
     * @return the boolean that returns true if the int is even
     */
    public static boolean isOdd(int myInteger){
        return (myInteger%2)!=0;
    }
    /**
     * isOdd is a static method
     * that takes a new MyInteger instance and returns true if it is odd and
     * false otherwise
     * @param myInteger the new Instance of MyInteger
     * @return the boolean that returns true if the MyInteger is odd
     */
    public static boolean isOdd(MyInteger myInteger){
        return MyInteger.isOdd(myInteger.getValue());
    }
    /**
     * isPrime is a static method
     * that takes a new MyInteger instance and returns true if it is prime and
     * false otherwise
     * @param myInteger the new Instance of MyInteger
     * @return the boolean that returns true if the MyInteger is prime
     */
    public static boolean isPrime(MyInteger myInteger){
        //use the existing method to check if prime
       return MyInteger.isPrime(myInteger.getValue());
    }
    /**
     * isPrime is a static method
     * that takes a int and returns true if it is prime and
     * false otherwise
     * @param myInteger the int to test
     * @return the boolean that returns true if the int is prime
     */
    public static boolean isPrime(int myInteger){
        //check if n is a multiple of 2
        //means we can logically half the amount of ints we have to iterate through
        if (myInteger%2==0){
            return false;
        }
        //if not, then just check the odds
        for(int i=3;i*i<=myInteger;i+=2) {
            if(myInteger%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * The parseInt method parse a string number into an int
     * @param stringInt the string
     * @return the integer value
     */
    public static int parseInt(String stringInt){
        return Integer.parseInt(stringInt);
    }

    /**
     * parseInt with char arg takes in an int array of chars and
     * iterates the array and parses each char to an int
     * @param charInt the array of chars
     * @return a totaled values of ints
     */
    public static int parseInt(char []charInt){
        int total = 0;
        for (int i = 0; i < charInt.length; i++){
            total += Character.getNumericValue(charInt[i]);
        }
        return total;
    }


    /**
     * The main method
     * @param args
     */
    public static void main(String args[]){
        //create an instance of myInteger
        MyInteger integer = new MyInteger(5);
        System.out.println("The int is: "+integer.getValue());
        System.out.println("Does the int = 4? "+ integer.equals(4));
        System.out.println("Does the int = 5? "+integer.equals(5));
        System.out.println("Is the int even? "+integer.isEven());
        System.out.println("Is the int odd? "+integer.isOdd());
        System.out.println("Is the value Prime? " + integer.isPrime());

        //test the static methods
        System.out.println("Static method is Even " + MyInteger.isEven(integer));
        System.out.println("Static method is Odd " + MyInteger.isOdd(integer));
        System.out.println("Static method is Prime " + MyInteger.isPrime(integer));
        System.out.println("Is 4 odd? " + MyInteger.isOdd(4));
        System.out.println("Is 4 even? " + MyInteger.isEven(4));
        System.out.println("Is 4 prime? " + MyInteger.isPrime(4));

        //test the equals  instance methods
        System.out.println("Is the int equal to 5 " + integer.equals(5));
        System.out.println("Is the new instance initialized to 4 equal to current instance " + integer.equals(new MyInteger(4)));

        //test the parseInt methods
        char [] charArray = {'1','2','3','4'};
        System.out.println("Parse a string '3' to an int " + MyInteger.parseInt("3"));
        System.out.println("Parse an array of chars to an int " + MyInteger.parseInt(charArray));



        //program that displays the prime numbers less then 120
        for(int i =120; i>0; i--){
            if(MyInteger.isPrime(i)){
                System.out.println(i+ " is Prime");
            }
        }

    



    }

}
