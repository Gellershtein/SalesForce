package elements;

import elements.base.BaseElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class LGTextArea extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String textAreaFieldLabel;
    String textAreaFieldLocator = BaseLightningInputElementLocator + "textarea";
    //*[contains(@class, 'modal-body')]//label[text()='Mailing Street']/ancestor::slot[@slot='inputField']//textarea


    public LGTextArea(WebDriver driver, String textAreaFieldLabel) {
        this.driver = driver;
        this.textAreaFieldLabel = textAreaFieldLabel;
    }

    public void write(String inputText) {
        log.info(String.format("Writing text '%s' into textarea with label %s", inputText, textAreaFieldLabel));
        //TO DO
        //JS SET STYLE TO HIGHLIGHT FIELD
        WebElement element = driver.findElement(By.xpath(String.format(textAreaFieldLocator, textAreaFieldLabel)));
        highlightElement(driver, element);
        element.sendKeys(inputText);
    }
}
