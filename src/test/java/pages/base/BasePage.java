package pages.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public static String URL = "https://profitero4.my.salesforce.com/";
    public static String BaseLocator = "//div[contains(@class,'active')]";
    public static final By NEW_BUTTON = By.xpath("//*[@title='New']");
    protected String icon = BaseLocator + "//img[@title='%s']";
    public static final By DETAILS_TAB = By.xpath(BaseLocator + "//*[@id='detailTab__item']");


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
            WebElement element = driver.findElement(By.xpath(String.format(textLocator, label)));
            highlightElement(driver, element);
            assertEquals(
                    element.getText(),
                    expected,
                    String.format("Input text for %s is not correct", label));
        } else {
            WebElement element = driver.findElement(By.xpath(String.format(addressLocator, label)));
            highlightElement(driver, element);
            assertEquals(
                    element.getText(),
                    expected,
                    String.format("Input text for %s is not correct", label));
        }
    }

    public void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: #3cff3c; border: 2px solid red;');", element);
    }
}
