import java.io.*;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int bal=10000;
        int withdrawAmt;
        int depositAmt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount you want to Withdraw: ");
        withdrawAmt=sc.nextInt();
        System.out.println("Enter the Amount you want to Deposit: ");
        depositAmt=sc.nextInt();
        displayBalance(bal);
        bal=amount_withdraw(bal,withdrawAmt);
        bal=amount_deposit(bal,depositAmt);
    }

    public static void displayBalance(int bal) {
        System.out.println("Current balance: " + bal);
        System.out.println();
    }

    public static int amount_withdraw(int bal, int withdraw_Amt) {
        System.out.println("Withdrawn operation");
        System.out.println("Withdraw Amount: " + withdraw_Amt);
        if (bal >= withdraw_Amt) {
            bal=bal-withdraw_Amt;
            System.out.println("Please collect your money and collect the card");
            displayBalance(bal);
        }
        else{
            System.out.println("Sorry insufficient Amount");
            System.out.println();
        }
        return bal;
    }
    public static int amount_deposit(int bal,int deposit_amt){
        System.out.println("Deposit operation");
        System.out.println("Depositing Amount: "+deposit_amt);
        bal=bal+deposit_amt;
        System.out.println("Your money has been successfully deposited");
        displayBalance(bal);
        return  bal;
    }
}

