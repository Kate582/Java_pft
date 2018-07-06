package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Екатерина on 7/6/2018.
 */
public class SquareTests {
  @Test
  public void testAres() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
