package cs1.Final;

/**
 * Created by jjenkins on 12/9/2016.
 */
public class Checking {

        private int id;
        private String name;
        private double balance;
        private double interestRate = 0.45;


        //no arg constructor
        public Checking(){

        }

        public Checking(int id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        //setters and getters


        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }


        public void withDraw(double amount){
            balance = balance - amount;
        }

        public void deposit(double amount){
            balance = balance + amount;
        }

    public static void main (String [] args){
        int[][] m = {{1,2},{2,3}};



        Checking account = new Checking(1234, "John White",1000);

        account.withDraw(200);
        account.deposit(400);

        System.out.println(account.getBalance());

    }




}
