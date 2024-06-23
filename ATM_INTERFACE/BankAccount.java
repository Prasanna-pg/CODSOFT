package Codsoft_internship_projects.ATM_INTERFACE;
import java.util.*;
public class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
            System.out.println("Deposit of $"+amount+" successful. Current balance: $"+balance);
        }else{
            System.out.println("Invalid Deposit Amount...");
        }
    }
    public void withDraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of $"+amount+" successful. Current balance: $"+balance);
        }else{
            System.out.println("Invalid withdrawal amount or insufficient balance...");
        }
    }
}
