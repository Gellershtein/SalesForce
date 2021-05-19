package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage extends BasePage {
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    String icon = BaseLocator + "//img[@title='%s']";
    String SHOW_MORE_ACTIONS_BUTTON = "//span[text()='Show more actions']//ancestor::a";
    String ACTIONS_BUTTONS = "//*[@class='scrollable']//child::a[@title='%s']"; //after clicking SHOW_MORE_ACTIONS_BUTTON and wait for rendering
    /*
    Edit
    Delete
    Change Owner
     */
    String SEARCH_FIELD = "//*[@placeholder='Search this list...']";

    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Account")));
    }

    public AccountsListPage open() {
        driver.get(URL + "/lightning/o/Account/list");
        return this;
    }

    public AccountModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }
}
