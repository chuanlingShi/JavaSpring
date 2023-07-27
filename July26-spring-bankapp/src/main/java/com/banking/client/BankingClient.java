package com.banking.client;


import com.banking.config.BankAppConfig;
import com.banking.dto.BankAccount;
import com.banking.exceptions.AccountNotFoundException;
import com.banking.service.BankAccountService;
import com.banking.service.BankAccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingClient {
    public static void main(String[] args) throws AccountNotFoundException {
//        BankAccountService service = new BankAccountServiceImpl();
//        service.addAccount(new BankAccount(101, "Customer A", 100));
//        service.addAccount(new BankAccount(102, "Customer B", 0));
//        service.addAccount(new BankAccount(103, "Customer C", 1000));
//
//        service.showAllAccounts();
//        service.updateAccount(new BankAccount(101, "Customer updated A", 9000));
//        service.deleteAccount(103);
//        service.showAllAccounts();
        ApplicationContext context = new AnnotationConfigApplicationContext(BankAppConfig.class);
        BankAccountService service = context.getBean(BankAccountServiceImpl.class);
        service.addAccount(new BankAccount(101, "Customer A", 100));
        service.addAccount(new BankAccount(102, "Customer B", 0));
        service.addAccount(new BankAccount(103, "Customer C", 1000));
        service.showAllAccounts();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
