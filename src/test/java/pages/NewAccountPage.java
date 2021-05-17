package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {
    String INPUT_FIELD = "//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='%s']//ancestor::label//following-sibling::input";
    String phone = "Phone";
    /* Fax
    Website
    Employees
    Annual Revenue
    Billing City
    Billing Zip/Postal Code
    Billing Country
    Shipping Address
    Shipping Street
    Shipping City
    Shipping State/Province
    Shipping Zip/Postal Code
    Shipping Country
     */
    String SEARCH_FIELD = "//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='%s']//ancestor::label//following-sibling::div//child::input";
    /*
    Account Name
    Parent Account
    */
    String DROPDOWN_FIELD = "//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='%s']//ancestor::span//following-sibling::div//child::a";
    /*
    Type
    Industry
     */
    String TEXTAREA_FIELD = "//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='%s']//ancestor::label//following-sibling::textarea";
    /*
    Description
    Shipping Street
     */
    String BILLING_TO_SHIPPING_CHECKBOX = "//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='Copy Billing Address to Shipping Address']//ancestor::label//following-sibling::input"; // the same as INPUT_FIELD
    String FOOTER_BUTTONS = "//*[@class='inlineFooter']//span[text()='%s']//ancestor::button";
    /*
    Save
    Save & New
    Cancel
     */

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(By.xpath(String.format(INPUT_FIELD, phone)));
    }
}