package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

@Log4j2
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
        log.info("Opening the Lead page");
        driver.get(URL + "/lightning/o/Lead/list");
        return this;
    }

    @Step("Click NEW button on Leads page")
    public LeadModal clickNew() {
        log.info("Clicking NEW button on the Lead page");
        driver.findElement(NEW_BUTTON).click();
        return new LeadModal(driver);
    }
}