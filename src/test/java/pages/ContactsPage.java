package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Contact")));
    }

    @Step("Open Contacts page")
    public ContactsPage open() {
        driver.get(URL + "/lightning/o/Contact/list");
        return this;
    }

    @Step("Click NEW button on Contacts page")
    public ContactModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new ContactModal(driver);
    }
}
