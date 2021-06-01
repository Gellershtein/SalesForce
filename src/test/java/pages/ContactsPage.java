package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

@Log4j2
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
        log.info("Opening the Contacts page");
        driver.get(URL + "/lightning/o/Contact/list");
        return this;
    }

    @Step("Click NEW button on Contacts page")
    public ContactModal clickNew() {
        log.info("Clicking NEW button on the Contacts page");
        driver.findElement(NEW_BUTTON).click();
        return new ContactModal(driver);
    }
}
