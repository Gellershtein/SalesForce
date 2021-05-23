package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogIn() {
        loginPage.open();
        assertTrue(loginPage.isPageOpened(), "Error: Open Login page is failed");
//        loginPage.logIn(USER, PASSWORD);
        assertTrue(
                loginPage
                        .logIn(USER, PASSWORD)
                        .isPageOpened(),
                "Error: Login failed");
    }
}
