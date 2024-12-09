package com.test;

import Pages.ButtonPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonTest extends BaseTest {


    @Test
    public void buttonTest(){

       ButtonPage buttonPage = new ButtonPage(driver);

       buttonPage.openEditPage();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("home")));
       buttonPage.click();
       buttonPage.comeBack();
       Point location = buttonPage.findLocation();
       System.out.println("Przycisk znajduje się w pozycji X: " + location.getX() + ", Y: " + location.getY());

       String color = buttonPage.findColor();
       System.out.println("Kolor przycisku to: " + color);

       Dimension size = buttonPage.findSize();
       System.out.println("Wysokość przycisku: " + size.getHeight() + " " + "Szerokość przycisku: " + size.getWidth());

       buttonPage.buttonIsEnabled();
       Assert.assertFalse("Pole powinno być nieaktywne", buttonPage.buttonIsEnabled());
       System.out.println("Pole jest nieaktywne");

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//h2[text()='Button Hold!']]")));
      buttonPage.holdButton();

      //czekam
        WebElement holdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.//h2[text()='Button has been long pressed']]")));
      String longButton = holdButton.getText(); //pobieram tekst nowego przycisku
      Assert.assertEquals("Button has been long pressed", longButton);
    }

}
