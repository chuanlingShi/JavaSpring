package com.banking.service;

import com.banking.dao.BankAccountDAO;
import com.banking.dao.BankAccountDAOImpl;
import com.banking.dto.BankAccount;
import com.banking.exceptions.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankAccountServiceImpl implements BankAccountService{
    @Autowired
    BankAccountDAO bankAccountDAO;
    @Override
    public void addAccount(BankAccount bankAccount) {
        bankAccountDAO.addAccount(bankAccount);
    }

    @Override
    public void updateAccount(BankAccount newBankAccount) throws AccountNotFoundException {
        bankAccountDAO.updateAccount(newBankAccount);
    }

    @Override
    public void deleteAccount(int actNumber) throws AccountNotFoundException {
        bankAccountDAO.deleteAccount(actNumber);
    }

    @Override
    public List<BankAccount> showAllAccounts() {
        return bankAccountDAO.showAllAccounts();
    }


    @Override
    public BankAccount findAccount(int actNumber) throws AccountNotFoundException {
        return bankAccountDAO.findAccount(actNumber);
    }
}
