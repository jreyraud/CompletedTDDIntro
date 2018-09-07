package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;
    public Account(int b) {
        balance = b;
    }

    public int deposit(int i) {
        balance += i;
        return balance;
    }

    public int withdraw(int i) {
        if (balance - i > 0){
            balance -= i;
        }
        return balance;
    }
}
