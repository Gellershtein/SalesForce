package pages;

import elements.SFDropDown;
import elements.SFInput;
import elements.SFTextArea;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BaseModal;

@Log4j2
public class AccountModal extends BaseModal {
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
    @Step("Fill in form for new Account")
    public AccountDetailsPage create(Account account) {
        log.info("Filling in form for new Account");
        new SFInput(driver, "Account Name").write(account.getAccountName());
        new SFInput(driver, "Parent Account").write(account.getParentAccount());
        new SFInput(driver, "Phone").write(account.getPhone());
        new SFInput(driver, "Fax").write(account.getFax());
        new SFInput(driver, "Website").write(account.getWebsite());
        new SFDropDown(driver, "Type").select(account.getType());
        new SFDropDown(driver, "Industry").select(account.getIndustry());
        new SFInput(driver, "Employees").write(account.getEmployees());
        new SFInput(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new SFTextArea(driver, "Description").write(account.getDescription());
        new SFTextArea(driver, "Billing Street").write(account.getBillingStreet());
        new SFInput(driver, "Billing City").write(account.getBillingCity());
        new SFInput(driver, "Billing State/Province").write(account.getBillingState());
        new SFInput(driver, "Billing Zip/Postal Code").write(account.getBillingPostalCode());
        new SFInput(driver, "Billing Country").write(account.getBillingCountry());
        new SFTextArea(driver, "Shipping Street").write(account.getShippingStreet());
        new SFInput(driver, "Shipping City").write(account.getShippingCity());
        new SFInput(driver, "Shipping State/Province").write(account.getShippingState());
        new SFInput(driver, "Shipping Zip/Postal Code").write(account.getShippingPostalCode());
        new SFInput(driver, "Shipping Country").write(account.getShippingCountry());
        save();
        return new AccountDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}