package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextArea extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String textAreaFieldLabel;
    //    String textAreaFieldLocator = "//*[contains(@class, 'modal-body')]//span[text()='%s']" + "/ancestor::div[contains(@class, 'uiInput')]//textarea";
    String textAreaFieldLocator = BaseInputElementLocator + "//textarea";

    public TextArea(WebDriver driver, String textAreaFieldLabel) {
        this.driver = driver;
        this.textAreaFieldLabel = textAreaFieldLabel;
    }

    public void write(String inputText) {
        System.out.println(String.format("Writing text '%s' into textarea with label %s", inputText, textAreaFieldLabel));
        //TO DO
        //JS SET STYLE TO HIGHLIGHT FIELD
        driver.findElement(By.xpath(String.format(textAreaFieldLocator, textAreaFieldLabel))).sendKeys(inputText);
    }
}
