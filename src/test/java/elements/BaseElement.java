package elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseElement {
    public static String BaseAccountPageInputElementLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]";
    public static String BaseContactsPageInputElementLocator = "//*[contains(@class, 'modal-body')]//label[text()='%s']/..//child::";
//  "//*[contains(@class, 'modal-body')]//label[text()='%s']/ancestor::slot[@slot='inputField']";
    //*[@data-aura-class='forceDetailPanelDesktop']//span[text()='%s']//ancestor::label//following-sibling::div//child::input"
    //*[contains(@class, 'modal-body')]//label[text()='Last Name']/ancestor::lightning-input//input

    public void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: #3cff3c; border: 2px solid red;');", element);
    }
}
