package com.banking.exceptions;

public class AccountNotFoundException extends Exception {

    private int accountNumber;

    public AccountNotFoundException(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountNotFoundException: Account not valid (" + accountNumber + ")";
    }
}


