package tests;

import models.Contact;
import models.ContactFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.util.Random;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {
    Random random = new Random();

    @Test(description = "Test for Adding new Contact")
    public void createNewContact() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        isOpened = loginPage
                .logIn(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        Contact contact = ContactFactory.get();
        contactsPage
                .open()
                .clickNew()
                .create(contact)
                .openDetailsTab()
//                .isPageOpened()
                .validateContact(contact);
    }
}
