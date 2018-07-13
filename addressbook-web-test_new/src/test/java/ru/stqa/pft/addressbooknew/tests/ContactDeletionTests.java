package ru.stqa.pft.addressbooknew.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbooknew.TestBase;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoContactPage();
    app.getGroupHelper().selectContact();
    app.getGroupHelper().deleteContacts();
    app.getGroupHelper().returnToContactPage();
  }

}
