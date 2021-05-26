package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseModal extends BasePage {
    public static final By SAVE_BUTTON = By.xpath("//*[@title='Save']");
    String modalTitle = "//h2[text()='%s']";

    public BaseModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }
}
