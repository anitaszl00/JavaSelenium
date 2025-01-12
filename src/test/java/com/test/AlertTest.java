package com.test;

import Pages.AlertPage;
import org.junit.Test;

public class AlertTest extends BaseTest{

    @Test
    public void alertTest() {
        AlertPage alertPage = new AlertPage(driver);
       alertPage.openAlertPage();

    }

}
