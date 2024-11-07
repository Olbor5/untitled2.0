package BankAccExercise;

import java.util.Scanner;

public class MyBankAcc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("We have created a new account for you");

        BankAccount myAccount = new BankAccount();

        //myAccount.printBalance();

        for(int i=0;i<5;i++) {
            System.out.println("Please add or withdraw money from your account");
            myAccount.changeBalance(scan.nextInt());
            // myAccount.printBalance();
        }


    }

}