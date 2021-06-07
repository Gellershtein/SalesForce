package elements;

import elements.base.BaseElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class SFDropDown extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String dropdownFieldLabel;
    //    String dropdownLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']" + "/ancestor::div[contains(@class, 'uiInput')]//a";
    String dropdownLocator = BaseSalesForceInputElementLocator + "//a";
    String optionLocator = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]//a[@title='%s']";

    public SFDropDown(WebDriver driver, String dropdownFieldLabel) {
        this.driver = driver;
        this.dropdownFieldLabel = dropdownFieldLabel;
    }

    public void select(String option) {
        try {
            WebElement element = driver.findElement(By.xpath(String.format(dropdownLocator, dropdownFieldLabel)));
            highlightElement(driver, element);
            element.click();
            wait = new WebDriverWait(driver, 4);
            log.info(String.format("Select option '%s' into dropdown with label %s", option, dropdownFieldLabel));
            element = driver.findElement(By.xpath(String.format(optionLocator, option)));
            highlightElement(driver, element);
            element.click();
        } catch (Exception exception) {
            log.fatal(exception.getStackTrace());
        }
    }
}