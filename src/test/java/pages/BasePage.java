package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public static String URL = "https://profitero2.lightning.force.com";
    public static String BaseLocator = "//div[contains(@class,'active')]";
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    String icon = BaseLocator + "//img[@title='%s']";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public abstract boolean isPageOpened();

    public boolean isExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());//Заменим на логер в будущем
            return false;
        }
    }

    public void validateInput(String label, String expected) {
        String fieldLocator = "//span[text()='%s']/ancestor::force-record-layout-item//*[@data-output-element-id='output-field']";
        String textLocator = BaseLocator + fieldLocator;
        String addressLocator = textLocator + "/a";
        if (!label.contains("Address")) {
            assertEquals(
                    driver.findElement(By.xpath(String.format(textLocator, label))).getText(),
                    expected,
                    "Input text is not correct");
        } else {
            assertEquals(
                    driver.findElement(By.xpath(String.format(addressLocator, label))).getText(),
                    expected,
                    "Input text is not correct");
        }
    }
}
