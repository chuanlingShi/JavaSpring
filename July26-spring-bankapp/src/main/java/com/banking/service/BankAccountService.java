package com.banking.service;

import com.banking.dto.BankAccount;
import com.banking.exceptions.AccountNotFoundException;

import java.util.List;

public interface BankAccountService {
    void addAccount(BankAccount bankAccount);

    void updateAccount(BankAccount newBankAccount) throws AccountNotFoundException;

    void deleteAccount(int actNumber)throws AccountNotFoundException;
    List<BankAccount> showAllAccounts();

    BankAccount findAccount(int actNumber) throws AccountNotFoundException;
}
