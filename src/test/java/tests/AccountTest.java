package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.util.Random;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {
    Random random = new Random();

    @Test(description = "Test for Adding new Account")
    public void createNewAccount() {
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
//        Account account = new Account("Test" + random.nextInt(10000), "SZ", "+3454", "12345", "www.test.by",
//                "Analyst", "Banking", "10", "1,111", "Test Account creation", "test billing street", "Minsk" + random.nextInt(10000), "Frunz",
//                "12345", "BY", "test shipping street", "Minsk" + random.nextInt(10000), "Partizansk", "12345", "By");
        Account account = AccountFactory.get();
        accountsListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
//                .isPageOpened()
                .validateAccount(account);
    }
}
