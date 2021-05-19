package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
    WebDriver driver;
    WebDriverWait wait;
    String dropdownFieldLabel;
    String dropdownLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//a";
    String optionLocator = "//*[contains(@class,'uiMenuList') and contains(@class,'visible')]//a[@title='%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.dropdownFieldLabel = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(dropdownLocator, dropdownFieldLabel))).click();
        System.out.println(String.format("Select option '%s' into dropdown with label %s", option, dropdownFieldLabel));
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
