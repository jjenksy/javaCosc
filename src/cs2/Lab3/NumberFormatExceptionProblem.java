package cs2.Lab3;

/**
 * John Jenkins
 * 02/13/2017
 * COSC 1174-048
 *Instructor: Kami Makki, Ph.D.
 * Lab 3 Hw3
 * Due Date: Tuesday, February 14, 2017
 * ((NumberFormatException) Write the bin2Dec(String binaryString) method to convert a
 * binary string into a decimal number. Implement the bin2Dec method to throw a
 * NumberFormatException if the string is not a binary string.)
 */
public class NumberFormatExceptionProblem {

    public static void main(String[] args) {

        System.out.println(bin2Dec("1100100"));
        // Purposely throwing an exception...
        System.out.println(bin2Dec("lafkja"));
    }

    /**
     * bin2Dec convert a binary string into a decimal number
     * @param binary
     * @return
     * @throws NumberFormatException throws a non custom exception
     */
    public static int bin2Dec(String binary) throws NumberFormatException {

        if (!isBinary(binary)) {
            throw new NumberFormatException(binary + " is not a binary number.");
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
            if (ch != '1' && ch != '0') return false;
        }
        return true;
    }
}
