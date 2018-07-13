package ru.stqa.pft.addressbooknew.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbooknew.TestBase;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
