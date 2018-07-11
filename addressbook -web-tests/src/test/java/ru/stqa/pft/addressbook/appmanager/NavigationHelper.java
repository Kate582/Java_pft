package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Екатерина on 7/11/2018.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
    this.wd = wd;
  }

  public void goToGroupPage() {
      click(By.linkText("groups"));
  }
}
