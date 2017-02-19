package cs2.LectureAssignments.programmingassignment1;

/**
 * Created by jenksy on 2/19/17.
 * The Employee class should define an employee’s first and last name, and include an abstract class for calculating pay. A manager’s pay is based on a pay period specified in weeks. Associates pay is by the hour.
 * The abstract pay() method in Employee will be overridden in Manager and Associate.
 */
public abstract class Employee {
    private String firstName; //the firstName of the employee
    private String lastName;// the lastName of the employee

    //no arg constructor
    public Employee() {
    }

    /**
     * Contructor that takes two args to setup employee
     * @param firstName the first name
     * @param lastName the last name
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * The method deifinition for a pay period
     * @param period the period that requested pay is for
     * @return the pay for the period
     */
    public abstract double pay(double period);


    /**
     * toString method overidden from the Main object
     * @return the first and last name of the employee
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
