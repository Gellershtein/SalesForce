package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage extends BasePage {
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    By icon = By.cssSelector("img[title='Contacts']");

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

    public AccountsListPage open() {
        driver.get(URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }
}
