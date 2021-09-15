package ru.deliverClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

  @Test
  public void firstTest() {
      System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
      ChromeDriver driver = new ChromeDriver();

      driver.get("https://www.delivery-club.ru");
      String title = driver.getTitle();
      Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
      driver.quit();

  }
}

