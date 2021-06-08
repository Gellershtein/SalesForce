package elements;

import elements.base.BaseElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class LGDropDown extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String dropdownFieldLabel;
    String dropdownLocator = BaseLightningInputElementLocator + "input";
    String optionLocator1 = "//input[@aria-expanded='true']//ancestor::div[contains(@class,'slds-is-open')]//span[text()='%s']";
    String optionLocator = "//*[contains(@class,'modal-body')]//*[contains(@class,'slds-form-element')]//*[@title='%s']";

    public LGDropDown(WebDriver driver, String dropdownFieldLabel) {
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
