/*
Let’s declare three public methods in the Account class that will serve as an interface to the outside world who
wants to access and manipulate the balance of an account.
•	 A getBalance() method will return the balance of an account.
•	 A credit() method will deposit a specified amount to an account.
•	 A debit() method will withdraw a specified amount from an account.
•	 Both credit() and debit() methods will return 1 if the transaction is successful and -1 if the
transaction fails.
 */



package AccessLevelCaseStudy;

public class Banktransaction {

    public double balance;


    public double getBalance() {


        return this.balance;

    }

    public int creditbalance(double amount) {


// Make sure credit amount is not negative, NaN or infinity
        if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            System.out.println("Invalid credit amount: " + amount);
            return -1;
        }

        // Credit the amount

        System.out.println("Credit amout is:" + amount);

        this.balance = this.balance + amount;

        return 1;

    }

    public int debitbalance(double amount) {

        // Make sure the debit amount is not negative, NaN or infinity */
        if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            System.out.println("Invalid debit amount: " + amount);
            return -1;
        }

        // Make sure a minimum balance of zero is maintained
        if (this.balance < amount) {
            System.out.println("Insufficient fund. Debit attempted: " + amount);
            return -1;
        }

        // Debit the amount
        System.out.println("Debiting amount: " + amount);
        this.balance = this.balance - amount;
        return 1;


    }

}
