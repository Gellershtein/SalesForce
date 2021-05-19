package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage extends BasePage {
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    By icon = By.cssSelector("img[title='Contacts']");
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
        return false;
    }

    public AccountsListPage open() {
        driver.get(URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    public AccountModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }
}
