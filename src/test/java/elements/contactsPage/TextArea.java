package elements.contactsPage;

import elements.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextArea extends BaseElement {
    WebDriver driver;
    WebDriverWait wait;
    String textAreaFieldLabel;
    String textAreaFieldLocator = BaseContactsPageInputElementLocator + "textarea";
    //*[contains(@class, 'modal-body')]//label[text()='Mailing Street']/ancestor::slot[@slot='inputField']//textarea


    public TextArea(WebDriver driver, String textAreaFieldLabel) {
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
