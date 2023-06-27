package com.bankaccount.domain;

public class BankAccount {

    private int accountNumber;

    private float accountBalance;

    private String customerName;

    private String email;

    private int phoneNumber;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(float amount){

        if(amount > 0){
          float newBalance = accountBalance += amount;
            System.out.println("Deposit of $ "+amount+" made. New Balance is $ "+newBalance);
        }else{
            System.out.println("The Deposit amount should be greater than $0.00");
        }

    }

    public void withdraw(float amount){
        if(accountBalance > 0 && amount <= accountBalance){
            float newBalance = accountBalance -= amount;
            System.out.println("Withdraw of $ "+amount+" made. New Balance is $ "+newBalance);
        }else{
            System.out.println("You don't have enough funds to make a withdraw");
        }
    }

    public BankAccount() {
    }

    public BankAccount(int accountNumber, float accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
