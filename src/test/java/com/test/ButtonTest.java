package com.test;

import Pages.ButtonPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonTest extends BaseTest {


    @Test
    public void buttonTest(){

       ButtonPage buttonPage = new ButtonPage(driver);

       buttonPage.openButtonPage();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       buttonPage.clickHomeButton();
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

       buttonPage.holdButton();

       Assert.assertTrue("Długi przycisk powinien być widoczny", buttonPage.isLongButtonVisible());

       String longButton = buttonPage.getLongButtonText();
       Assert.assertEquals("Button has been long pressed", longButton);
    }

}
