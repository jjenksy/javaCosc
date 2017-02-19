package cs2.LectureAssignments.programmingassignment1;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by jenksy on 2/19/17.
 * 1.	The SalesCenter application stores information about three employees. There is one manager (Diego Martin, salary $55,000), and two associates (Kylie Walter earning 18.50 per hour and Michael Rose earning $16.75 per hour). SalesCenter should be able to display the name and title for a specified employee. Additionally, the SalesCenter application should calculate and display the pay for a specified employee based on the pay argument entered by the user. The pay argument is hours worked if the pay is for an associate. The pay argument is number of weeks if the manager pay is to be calculated.
 * The SalesCenter interface provides a menu of options. Depending on the option, additional input may be required. An example of the inputs and outputs below:
 *
 */
public class SalesCenter {
    /**
     * Displays employee name and pay.
     */
    public static void payEmployee(Employee emp, double payArg) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double pay;

        System.out.println(emp);
        pay = emp.pay(payArg);
        System.out.println(money.format(pay));
    }

    public static void main(String[] args) {
        Manager emp1 = new Manager("Diego","Martin", 55000);
        Associate emp2 = new Associate("Kylie", "Walter", 18.50);
        Associate emp3 = new Associate("Michael", "Rose", 16.75);
        Scanner input = new Scanner(System.in);
        String action;
        int empNum;
        double payArg;
        Employee emp = emp1;	//set to default emp1

		/* display menu of choices */
        do {
            System.out.println("\nEmployee\\Pay\\Quit");
            System.out.print("Enter choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {
                System.out.print("Enter employee number (1, 2, or 3):");
                empNum = input.nextInt();
                switch (empNum) {
                    case 1: emp = emp1; break;
                    case 2: emp = emp2; break;
                    case 3: emp = emp3; break;
                }
                if (action.equalsIgnoreCase("E")) {
                    System.out.println(emp);
                } else if (action.equalsIgnoreCase("P")) {
                    System.out.print("Enter the hours for associate or pay period for manager: ");
                    payArg = input.nextDouble();
                    payEmployee(emp, payArg);
                }
            }
        } while (!action.equalsIgnoreCase("Q"));
    }

}
