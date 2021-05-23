package elements.AccountsPage;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String dropdownFieldLabel;
    //    String dropdownLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']" + "/ancestor::div[contains(@class, 'uiInput')]//a";
    String dropdownLocator = BaseAccountPageInputElementLocator + "//a";
    String optionLocator = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]//a[@title='%s']";

    public DropDown(WebDriver driver, String dropdownFieldLabel) {
        this.driver = driver;
        this.dropdownFieldLabel = dropdownFieldLabel;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(dropdownLocator, dropdownFieldLabel))).click();
        System.out.println(String.format("Select option '%s' into dropdown with label %s", option, dropdownFieldLabel));
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
