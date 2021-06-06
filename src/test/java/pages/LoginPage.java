package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

@Log4j2
public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Login page")
    public LoginPage open() {
        log.info("Opening the Login page");
        driver.get(URL);
        return this;
    }

    @Override
    public boolean isPageOpened() {
        return isExist(LOGIN_BUTTON);
    }

    @Step("Fill in Login form")
    public HomePage logIn(String user, String password) {
        log.info("Filling in Login");
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}
