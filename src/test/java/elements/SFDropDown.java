package elements;

import elements.base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebElement element = driver.findElement(By.xpath(String.format(dropdownLocator, dropdownFieldLabel)));
        highlightElement(driver, element);
        element.click();
        System.out.println(String.format("Select option '%s' into dropdown with label %s", option, dropdownFieldLabel));
        element = driver.findElement(By.xpath(String.format(optionLocator, option)));
        highlightElement(driver, element);
        element.click();
    }
}
