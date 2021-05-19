package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test
    public void addNewAccount() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        isOpened = loginPage
                .logIn(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
       //FACTORY
       //BUILDER
       //RANDOM DATA
        Account account = new Account("Test", "SZ", "+3454", "12345","www.test.by",
                "Analyst", "Banking", "10","1111","Minsk", "Pushk",
                "12345", "BY", "Minsk", "Partizansk","12345","By");
        accountsListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}
