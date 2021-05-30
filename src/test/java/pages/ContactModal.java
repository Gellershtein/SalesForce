package pages;

import elements.LGDropDown;
import elements.LGInput;
import elements.LGSearch;
import elements.LGTextArea;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BaseModal;

public class ContactModal extends BaseModal {

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(By.xpath(String.format(modalTitle, "New Contact")));
    }

    //ATLAS//JDI
    @Step("Fill in form for new Contact")
    public ContactDetailsPage create(Contact contact) {
        new LGDropDown(driver, "Salutation").select(contact.getSalutation());
        new LGInput(driver, "First Name").write(contact.getFirstName());
        new LGInput(driver, "Last Name").write(contact.getLastName());
        new LGSearch(driver, "Account Name").select(contact.getAccountName());
        new LGInput(driver, "Title").write(contact.getTitle());
        new LGInput(driver, "Phone").write(contact.getPhone());
        new LGInput(driver, "Mobile").write(contact.getMobile());
        new LGInput(driver, "Email").write(contact.getEmail());
        new LGSearch(driver, "Reports To").select(contact.getReportsTo());
        new LGTextArea(driver, "Mailing Street").write(contact.getMailingStreet());
        new LGInput(driver, "Mailing City").write(contact.getMailingCity());
        new LGInput(driver, "Mailing Zip/Postal Code").write(contact.getMailingPostalCode());
        new LGInput(driver, "Mailing State/Province").write(contact.getMailingState());
        new LGInput(driver, "Mailing Country").write(contact.getMailingCountry());
        new LGTextArea(driver, "Other Street").write(contact.getOtherStreet());
        new LGInput(driver, "Other City").write(contact.getOtherCity());
        new LGInput(driver, "Other Zip/Postal Code").write(contact.getOtherPostalCode());
        new LGInput(driver, "Other State/Province").write(contact.getOtherState());
        new LGInput(driver, "Other Country").write(contact.getOtherCountry());
        new LGInput(driver, "Fax").write(contact.getFax());
        new LGInput(driver, "Home Phone").write(contact.getHomePhone());
        new LGInput(driver, "Other Phone").write(contact.getOtherPhone());
        new LGInput(driver, "Asst. Phone").write(contact.getAsstPhone());
        new LGInput(driver, "Assistant").write(contact.getAssistant());
        new LGInput(driver, "Department").write(contact.getDepartment());
        new LGDropDown(driver, "Lead Source").select(contact.getLeadSource());
        new LGInput(driver, "Birthdate").write(contact.getBirthdate());
        new LGTextArea(driver, "Description").write(contact.getDescriptionInfo());
        save();
        return new ContactDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}