package ru.stqa.pft.addressbooknew;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    gotoGroupPage();
    selectGroup();
    deleteGroups();
    returnToGroupPage();
  }

}