package ru.stqa.pft.addressbooknew;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test11", "header11", "footer11"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
