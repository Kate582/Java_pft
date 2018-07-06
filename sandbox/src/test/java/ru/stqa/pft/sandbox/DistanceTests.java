package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

/**
 * Created by Екатерина on 6/23/2018.
 */
public class DistanceTests {
  @Test
  public void testDistance() {
    Point p1 = new Point(1,5);
    Point p2 = new Point(7,2);
    String formattedDouble = new DecimalFormat("#0.00").format(p1.distance(p2));
    Assert.assertEquals(formattedDouble, "6.71");
  }
}
