package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class PRLoginTest extends BaseTest {

    @Test
    public void successfulLogIn() {
        loginPage.open();
        assertTrue(loginPage.isPageOpened(), "Error: Open Login page is failed");
//        loginPage.logIn(USER, PASSWORD);
        assertTrue(
                loginPage
                        .logIn(System.getProperty("USER"), System.getProperty("PASSWORD"))
                        .isPageOpened(),
                "Error: Login failed");
    }
}
