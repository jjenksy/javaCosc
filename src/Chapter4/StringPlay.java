package Chapter4;
/**
 * COSC 1173 Programming Lab
 * @author Name: John Jenkins
 * Data: 9/15/2016
 * // StringPlay.java
 *  Play with String objects
 *  Fill in the blanks in the program below as follows:
 *  (a)   declare the variable town as a reference to a String object and initialize it to "Anytown, USA".
 *  (b)   write an assignmentstatement that invokesthe length method of the string class to find the length of the
 *  college String object and assigns the result to the stringLength variable
 *  (c)   complete the assignmentstatementso that change1 containsthe same characters as college but all in
 *  upper case
 *  (d)   complete the assignmentstatementso that change2 is the same as change1 except all capital O's are
 *  replaced with the asterisk (*) character.(e)
 *     complete the assignmentstatementso that change3 is the concatenation of college and town (use the
 *  concat method of the String class rather than the + operator)
 *******************************/

public class StringPlay {
    public static void main (String[] args)
    {
        String college = new String ("PoDunk College");
        //String var town answer to a
        String town = "Anytown, USA"; // part (a)
        int stringLength;
        String change1, change2, change3;
        //set stringLength to the result of the int length of college
        stringLength = college.length(); // part (b)
        System.out.println (college + " contains " + stringLength +
                " characters.");
        //make college all uppercase by calling the instance method
        change1 = college.toUpperCase(); // part (c)
        //replace the Capital O's with asterisks
        change2 = change1.replace('O','*'); // part (d)
        //concatenate the two string vars
        change3 = college.concat(town) ; // part (e)
        //log the final chage to the console
        System.out.println ("The final string is " + change3);

    }
}
