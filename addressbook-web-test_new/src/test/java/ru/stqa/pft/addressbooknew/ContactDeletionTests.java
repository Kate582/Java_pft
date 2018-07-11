package ru.stqa.pft.addressbooknew;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    gotoContactPage();
    selectContact();
    deleteContacts();
    returnToContactPage();
  }

}
