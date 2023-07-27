package com.banking.dao;

import com.banking.dto.BankAccount;
import com.banking.exceptions.AccountNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BankAccountDAOImpl implements BankAccountDAO {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    @Override
    public void addAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public void updateAccount(BankAccount newBankAccount) throws AccountNotFoundException {
        BankAccount bankAccount = findAccount(newBankAccount.getActNumber());
        bankAccounts.set(bankAccounts.indexOf(bankAccount), newBankAccount);
    }

    @Override
    public void deleteAccount(int actNumber) throws AccountNotFoundException {
        bankAccounts.remove(findAccount(actNumber));
    }

    @Override
    public List<BankAccount> showAllAccounts() {
        System.out.println(bankAccounts);
        return bankAccounts;
    }

    @Override
    public BankAccount findAccount(int actNumber) throws AccountNotFoundException {
        for (BankAccount account : bankAccounts) {
            if (account.getActNumber() == actNumber) {
                return account;
            }
        }
        throw new AccountNotFoundException(actNumber);
    }
}
