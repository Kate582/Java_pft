package ru.stqa.pft.addressbooknew.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbooknew.model.GroupData;
import ru.stqa.pft.addressbooknew.TestBase;

public class  GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test11", "header11", "footer11"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
