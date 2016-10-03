package Chapter6Methods;

import java.util.Scanner;

/**
 * Created by jjenkins on 10/3/2016.
 * Programming Question
 *Write a method to convert from Celsius to Fahrenheit using the following method header:
 * convers form Celsius to Fahrenheit
 *public static double celsiusToFahrenheit (double celsius)
 *The formula for the conversion is: Fahrenheit = ( 9/5) * Celsius +32
 *Write a test program that asks the user to input a Celsius value, invoke this method, then
 *print out the corresponding Fahrenheit value.
 *Sample Run:
 *Please input the temperature in Celsius: 32
 *32 Celsius equals to 89.6 Fahrenheit.
 *Bonus
 *Write a test program that invokes this method several times to display the following tables
 *using loops:
 *Celsius Fahrenheit
 *40.0 104.0
 *39.0 102.2
 *… …
 *32.0 89.6
 *31.0 87.8
 8*/
public class CelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        //prompt the user for input
        System.out.print("Please input the temperature in Celsius: ");
        //get the users input
        double cels = input.nextDouble();


        System.out.println(cels + " Celsius equals to " + celsiusToFahrenheit(cels) + " Fahrenheit.");
        //invoke the bonus test method with param to match the assignment
        celsiusToFahrenheitTest(40);

    }
    //converts form Celsius to Fahrenheit
    public static double celsiusToFahrenheit (double celsius){
        //create and instance of the DecimalFormat object

        double converter = (celsius*1.8)+32.0;
        //perform the conversion a return the value
        return  converter;
    }

    /**
     * Bonus test program methods the publicly accessed method
     * @param celsius the arg to be displayed and converted
     */
    //bonus  test program that invokes this method several times to display the following tables
    public static void celsiusToFahrenheitTest (double celsius){
            celsiusToFahrenheitHeader();
            celsiusToFahrenheitBody(celsius);

    }


    /**
     * private method create the header
     */
    private static void celsiusToFahrenheitHeader (){
        System.out.println("Celsius       Fahrenheit");
    }


    /**
     * private method to create the body
     * @param celsius the arg to be displayed and converted
     */
    private static void celsiusToFahrenheitBody (double celsius){
        //iterate over the celsius value to create the body
        while(celsius>=31){
            //log the formatted value to the console
            System.out.printf("\n"+celsius + "        %.1f", celsiusToFahrenheit(celsius));
            //decrement the argument
            celsius--;
        }
    }
}
