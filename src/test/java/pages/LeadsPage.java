package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LeadsPage extends BasePage {

    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(icon, "Leads")));
    }

    @Step("Open Leads page")
    public LeadsPage open() {
        driver.get(URL + "/lightning/o/Lead/list");
        return this;
    }

    @Step("Click NEW button on Leads page")
    public LeadModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new LeadModal(driver);
    }
}