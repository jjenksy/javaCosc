package cs2.Lab3;

/**
 * John Jenkins
 * 02/13/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 3 Hw3
 * Due Date: Tuesday, February 14, 2017
 * (BinaryFormatException) The exercise (below) implements the bin2Dec method to throw a
 * BinaryFormatException if the string is not a binary string. Define a custom exception called
 * BinaryFormatException. Implement the bin2Dec method to throw a BinaryFormatException
 * if the string is not a binary string.
 */
public class BinaryFormatProblem {
    public static void main(String[] args) {

        System.out.println(bin2Dec("1100100"));
        // Purposely throwing an exception...
        System.out.println(bin2Dec("lafkja"));
    }

    /**
     * THis method converts binary string into a decimal and throws an exception if
     * the input is not binary
     * @param binary the binary string
     * @return the decimal value
     * @throws BinaryFormatException our custom exception
     */
    public static int bin2Dec(String binary) throws BinaryFormatException {
        //test to see if the input is binary
        if (!isBinary(binary)) {
            throw new BinaryFormatException(binary + " is not a binary number.");
        }
        int power = 0;
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {

            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    /**
     * isBinary
     * @param binary
     * @return
     */
    public static boolean isBinary(String binary) {

        for (char ch : binary.toCharArray()) {
            if (ch != '1' && ch != '0'){
                return false;
            }
        }
        return true;
    }

}

/**
 * BinaryFormatException is my custom class extending the IllegalArgumentException
 * so we are able to create a custom exception for the BinaryFormatException
 */
class BinaryFormatException extends IllegalArgumentException {

    BinaryFormatException(String s) {
        super(s);
    }
}
