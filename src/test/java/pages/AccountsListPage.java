package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

@Log4j2
public class AccountsListPage extends BasePage {

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Account")));
    }

    @Step("Open Accounts page")
    public AccountsListPage open() {
        log.info("Opening the Accounts page");
        driver.get(URL + "/lightning/o/Account/list");
        return this;
    }

    @Step("Click NEW button on Accounts page")
    public AccountModal clickNew() {
        log.info("Clicking NEW button on the Accounts page");
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }
}
