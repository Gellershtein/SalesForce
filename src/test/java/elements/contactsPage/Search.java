package elements.contactsPage;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String searchFieldLabel;
    String searchLocator = BaseContactsPageInputElementLocator + "input";
    String searchResultLocator = "//input[@aria-expanded='true']//ancestor::div[contains(@class,'slds-is-open')]//strong[text()='%s']";

    public Search(WebDriver driver, String searchFieldLabel) {
        this.driver = driver;
        this.searchFieldLabel = searchFieldLabel;
    }

    public void select(String option) {
        WebElement element = driver.findElement(By.xpath(String.format(searchLocator, searchFieldLabel)));
        highlightElement(driver, element);
        element.click();
        element.sendKeys(option);
        highlightElement(driver, element);
        System.out.println(String.format("Select option '%s' into dropdown with label %s", option, searchFieldLabel));
        driver.findElement(By.xpath(String.format(searchResultLocator, option))).click();
    }
}
