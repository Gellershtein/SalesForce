package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Input {
    WebDriver driver;
    WebDriverWait wait;
    String inputFieldLabel;
    String inputFieldLocator = "//*[contains(@class, 'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//input";

    public Input(WebDriver driver, String inputFieldLabel) {
        this.driver = driver;
        this.inputFieldLabel = inputFieldLabel;
    }

    public void write(String inputText) {
        System.out.println(String.format("Writing text '%s' into input with label %s", inputText, inputFieldLabel));
        //TO DO
        //JS SET STYLE TO HIGHLIGHT FIELD
        driver.findElement(By.xpath(String.format(inputFieldLocator, inputFieldLabel))).sendKeys(inputText);
    }
}