package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModal extends BasePage {
    public static final By SAVE_BUTTON = By.xpath("//*[@title='Save']");
    String modalTitle = "//h2[text()='%s']";
    String SEARCH_FIELD = "//*[@data-aura-class='forceDetailPanelDesktop']//span[text()='%s']//ancestor::label//following-sibling::div//child::input";
    /*
    Account Name
    Parent Account
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

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(modalTitle, "New Account")));
    }

    //ATLAS//JDI
    public AccountDetailsPage create(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Parent Account").write(account.getParentAccount());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingPostalCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingPostalCode());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new DropDown(driver, "Type").select("Analyst");
        new DropDown(driver, "Industry").select("Banking");
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
        save();
        return new AccountDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}