package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Contact")));
    }

    public ContactsPage open() {
        driver.get(URL + "/lightning/o/Contact/list");
        return this;
    }

    public ContactModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new ContactModal(driver);
    }
}
