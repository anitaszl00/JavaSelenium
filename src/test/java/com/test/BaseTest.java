package com.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    protected WebDriver driver; // WebDriver jako pole klasy, widoczne dla klas dziedziczących

    @Before

    public void setUp() {
        //konfiguracja WebDrivera
        System.setProperty("webdriver.chrome.driver", "/Users/anita/chromedriver");
        driver = new ChromeDriver();

    }

    @After
    public void close() {

        driver.quit();
    }

    }
