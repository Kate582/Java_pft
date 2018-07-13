package ru.stqa.pft.addressbooknew.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbooknew.model.ContactData;
import ru.stqa.pft.addressbooknew.TestBase;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getGroupHelper().initContactCreation();
    app.getGroupHelper().fillContactForm(new ContactData("firstname1", "lastname1", "che", "+79068644433", "q@q.q"));
    app.getGroupHelper().submitContactCreation();
    app.getGroupHelper().returnToContactPage();
  }

}
