package oo;

public class Account{
    int account_number = 12345;
    int account_balance = 0;

    //function
    void show(){
        System.out.println("Thong tin tai khoan:");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }

    void withdraw(int withdrawAmount){

        account_balance -= withdrawAmount;

    }

    void deposit(int depositAmount){

        account_balance += depositAmount;

    }
}