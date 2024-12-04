package com.test;

import Pages.ButtonPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
    }


}
