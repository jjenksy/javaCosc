package cs2.LectureAssignments.programmingassignment1;

/**
 * Created by jenksy on 2/19/17.
 * Associate (extends Employee)
 -	+Associate(fname hourlyPayRate
 : string, lName: string, rate: double)
 +getRate() : double      // returns the hourly pay rate
 +pay(hours: double) : double   // returns the amount earned based on hourly rate and hours worked
 +toString()   // returns a string with employee name and title (associate)

 */
public class Associate extends Employee{

    private double hourlyPayRate;
    /**
     * No-arg contructor
     */
    public Associate() {
        super();
    }


    /**
     * Constructor with args to setup an associate
     * @param firstName the associates firstname
     * @param lastName the assoiciates last name
     * @param hourlyPayRate the associates pay rate
     */
    public Associate(String firstName, String lastName, double hourlyPayRate) {
        super(firstName, lastName);
        this.hourlyPayRate = hourlyPayRate;
    }

    //accessor to get the hourlyPayRate
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    /**
     * Implemented from the abstract Employee class a specific implementation to caluclate
     * the pay for an associate
     * @param hours the hours worked
     * @return returns the amount earned based on hourly rate and hours worked
     */
    @Override
    public double pay(double hours) {
        return this.getHourlyPayRate()*hours;
    }


    @Override
    public String toString() {
        return "Associate: " + super.toString();
    }
}
