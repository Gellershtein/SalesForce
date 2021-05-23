package pages;

import elements.ContactsPage.DropDown;
import elements.ContactsPage.Input;
import elements.ContactsPage.Search;
import elements.ContactsPage.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModal extends BaseModal {

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(modalTitle, "New Contact")));
    }

    //ATLAS//JDI
    public ContactDetailsPage create(Contact contact) {
        new DropDown(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Search(driver, "Account Name").select(contact.getAccountName());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Email").write(contact.getEmail());
        new Search(driver, "Reports To").select(contact.getReportsTo());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingPostalCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Other Street").write(contact.getOtherStreet());
        new Input(driver, "Other City").write(contact.getOtherCity());
        new Input(driver, "Other Zip/Postal Code").write(contact.getOtherPostalCode());
        new Input(driver, "Other State/Province").write(contact.getOtherState());
        new Input(driver, "Other Country").write(contact.getOtherCountry());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Home Phone").write(contact.getHomePhone());
        new Input(driver, "Other Phone").write(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").write(contact.getAsstPhone());
        new Input(driver, "Assistant").write(contact.getAssistant());
        new Input(driver, "Department").write(contact.getDepartment());
        new DropDown(driver, "Lead Source").select(contact.getLeadSource());
        new Input(driver, "Birthdate").write(contact.getBirthdate());
        new TextArea(driver, "Description").write(contact.getDescriptionInfo());
        save();
        return new ContactDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}