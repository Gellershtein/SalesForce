package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TextArea extends BasePage {
    String textAreaFieldLocator = "//*[contains(@class, 'modal-body')]//span[text()='%s']" +
            "/ancestor::div[contains(@class, 'uiInput')]//textarea";

    public TextArea(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
