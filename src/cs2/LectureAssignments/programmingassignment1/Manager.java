package cs2.LectureAssignments.programmingassignment1;

/**
 * Created by jenksy on 2/19/17.
 * Manager (extends Employee)
 -	yearlySalary
 +Manager(fName: string, lName: string, sal: double)
 +getSalary() : double    // returns the yearly salary
 +pay(weeks: double) : double    // returns amount earned based on the annual salary / 52
 +toString()      // returns a string with the employee name and title (manager)
 */
public class Manager extends Employee{

    private double yearlySalary;//the managers annual salary

    //no arg constructor
    public Manager() {
    }

    /**
     * Contructor with args to setup the manager
     * @param firstName
     * @param lastName
     * @param yearlySalary
     */
    public Manager(String firstName, String lastName, double yearlySalary) {
        super(firstName, lastName);
        this.yearlySalary = yearlySalary;
    }

    //accessor method for getting the salary
    public double getYearlySalary() {
        return yearlySalary;
    }

    @Override
    public double pay(double period) {
        return (this.yearlySalary/52)*period;
    }

    // returns a string with the employee name and title (manager)


    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }
}
