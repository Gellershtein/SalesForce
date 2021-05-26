package elements.contactsPage;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String dropdownFieldLabel;
    String dropdownLocator = BaseContactsPageInputElementLocator + "input";
    String optionLocator = "//input[@aria-expanded='true']//ancestor::div[contains(@class,'slds-is-open')]//span[text()='%s']";

    public DropDown(WebDriver driver, String dropdownFieldLabel) {
        this.driver = driver;
        this.dropdownFieldLabel = dropdownFieldLabel;
    }

    public void select(String option) {
        WebElement element = driver.findElement(By.xpath(String.format(dropdownLocator, dropdownFieldLabel)));
        highlightElement(driver, element);
        element.click();
        System.out.println(String.format("Select option '%s' into dropdown with label %s", option, dropdownFieldLabel));
        element = driver.findElement(By.xpath(String.format(optionLocator, option)));
        highlightElement(driver, element);
        element.click();
    }
}
