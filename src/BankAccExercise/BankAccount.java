package BankAccExercise;

public class BankAccount {

    private int balance;
    //private int newBalance;

    public BankAccount() {
        balance = 0;
    }

    public void printBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void changeBalance(int change) {

        //Kontrollera om vi kan få en för liten balance dvs. balance blir mindre än 0
        if (balance + change >= 0) {
            balance += change;
        }

    }


}