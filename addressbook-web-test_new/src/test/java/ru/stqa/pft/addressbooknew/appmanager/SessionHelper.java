package ru.stqa.pft.addressbooknew.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Екатерина on 7/13/2018.
 */
public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }
  public void login(String username, String password) {
    type(By.name("user"),username);
    type(By.name("pass"),password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }

}
