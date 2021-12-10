package com.company;

public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account (String owner, int balance, String accountNumber){
        super();
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {return owner;}
    public String getAccountNumber() {return accountNumber;}
    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}

    public void withdrawal(int amount) throws NotEnoughMoneyException {
        if (balance >= amount) balance = balance - amount;
        else{
            System.out.println("Za mało środków na koncie");

            throw new NotEnoughMoneyException("Za mało środków na koncie");
        }
    }
}
