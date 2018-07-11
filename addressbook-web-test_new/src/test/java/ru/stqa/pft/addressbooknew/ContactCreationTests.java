package ru.stqa.pft.addressbooknew;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        gotoContactPage();
        initContactCreation();
        fillContactForm(new ContactData("firstname1", "lastname1", "che", "+79068644433", "q@q.q"));
        submitContactCreation();
        returnToContactPage();
    }

}
