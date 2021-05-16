package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void successfulLogIn() {
        loginPage.open();
        assertTrue(loginPage.isPageOpen(), "Error: Open Login page is failed");
//        loginPage.logIn(USER, PASSWORD);
        assertTrue(
                loginPage
                .logIn(USER, PASSWORD)
                .isPageOpen(),
                "Error: Login failed");
    }
}
