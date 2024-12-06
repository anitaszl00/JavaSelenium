package com.test;

import Pages.InputPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class InputTest extends BaseTest{

    @Test
    public void inputTest(){


// Tworzenie obiektu InputPage z WebDriverem
        InputPage inputPage = new InputPage(driver);
        inputPage.openEditPage();;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName")));

        inputPage.fillFullName("Jan Kowalski");
        inputPage.keyboardTab();

        inputPage.getAttribute();
        inputPage.clear();

        inputPage.confirmButton();

        Assert.assertFalse("Pole powinno być wyłączone", inputPage.confirmButton());
        System.out.println("Pole jest nieaktywne");


        inputPage.readOnly();
        Assert.assertTrue("To pole powinno być readonly", inputPage.readOnly());
        System.out.println("Pole jest tylko do odczytu");



    }

}
