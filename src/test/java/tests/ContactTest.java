package tests;

import models.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.util.Random;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {
    Random random = new Random();

    @Test(description = "Test for Adding new Contact")
    public void addNewContact() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        isOpened = loginPage
                .logIn(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Page didn't opened");
        Contact contact = new Contact("Prof.", "Ilon", "Mask", "TestAccount", "Scammer",
                "+33123", "+2133", "ilon@scammer.com", "Boss", "test malling street", "Minsk",
                "Frunz", "12345", "BY", "test other street", "Minsk", "Partizansk",
                "12345", "By", "333", "Trading", "9379992", "Word of mouth", "666",
                "5/1/1941", "777", "chio", "Dogefather");
        contactsPage
                .open()
                .clickNew()
                .create(contact)
                .openDetailsTab()
//                .isPageOpened()
                .validateContact(contact);
    }
}
