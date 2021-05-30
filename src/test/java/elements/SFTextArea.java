package elements;

import elements.base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFTextArea extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    //Account Page
    String textAreaFieldLabel;
    //    String textAreaFieldLocator = "//*[contains(@class, 'modal-body')]//span[text()='%s']" + "/ancestor::div[contains(@class, 'uiInput')]//textarea";
    String textAreaFieldLocator = BaseSalesForceInputElementLocator + "//textarea";
    //Contacts Page

    public SFTextArea(WebDriver driver, String textAreaFieldLabel) {
        this.driver = driver;
        this.textAreaFieldLabel = textAreaFieldLabel;
    }

    public void write(String inputText) {
        System.out.println(String.format("Writing text '%s' into textarea with label %s", inputText, textAreaFieldLabel));
        //TO DO
        //JS SET STYLE TO HIGHLIGHT FIELD
        WebElement element = driver.findElement(By.xpath(String.format(textAreaFieldLocator, textAreaFieldLabel)));
        highlightElement(driver, element);
        element.sendKeys(inputText);
    }
}
