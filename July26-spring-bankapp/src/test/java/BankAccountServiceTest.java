import com.banking.dto.BankAccount;
import com.banking.exceptions.AccountNotFoundException;
import com.banking.service.BankAccountService;
import com.banking.service.BankAccountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountServiceTest {
    private BankAccountService service;

    @BeforeEach
    public void setup() {
        service = new BankAccountServiceImpl();
    }

    @Test
    public void testAddAccount() {
        BankAccount account = new BankAccount(101, "Customer A", 100);
        assertDoesNotThrow(() -> service.addAccount(account));
    }

    @Test
    public void testUpdateAccount() throws AccountNotFoundException {
        BankAccount account = new BankAccount(101, "Customer A", 100);
        service.addAccount(account);

        BankAccount updatedAccount = new BankAccount(101, "Customer Updated A", 9000);
        assertDoesNotThrow(() -> service.updateAccount(updatedAccount));

        BankAccount foundAccount = service.findAccount(101);
        assertEquals(updatedAccount.getCustomerName(), foundAccount.getCustomerName());
        assertEquals(updatedAccount.getActBalance(), foundAccount.getActBalance());
    }

    @Test
    public void testDeleteAccount() throws AccountNotFoundException {
        BankAccount account = new BankAccount(103, "Customer C", 1000);
        service.addAccount(account);

        assertDoesNotThrow(() -> service.deleteAccount(103));

        assertThrows(AccountNotFoundException.class, () -> service.findAccount(103));
    }

    @Test
    public void testFindAccount() throws AccountNotFoundException {
        BankAccount account = new BankAccount(102, "Customer B", 0);
        service.addAccount(account);

        BankAccount foundAccount = service.findAccount(102);
        assertNotNull(foundAccount);
        assertEquals(account.getCustomerName(), foundAccount.getCustomerName());
        assertEquals(account.getActBalance(), foundAccount.getActBalance());
    }

    @Test
    public void testFindNonExistentAccount() {
        assertThrows(AccountNotFoundException.class, () -> service.findAccount(999));
    }

    @Test
    public void testShowAllAccounts() {
        BankAccount account1 = new BankAccount(101, "Customer A", 100);
        BankAccount account2 = new BankAccount(102, "Customer B", 0);
        BankAccount account3 = new BankAccount(103, "Customer C", 1000);

        service.addAccount(account1);
        service.addAccount(account2);
        service.addAccount(account3);

        assertDoesNotThrow(() -> service.showAllAccounts());
    }
}
