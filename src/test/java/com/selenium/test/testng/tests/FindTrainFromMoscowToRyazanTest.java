package com.selenium.test.testng.tests;

import com.selenium.test.BaseTest;
import com.selenium.test.pages.*;
import com.selenium.test.testng.listeners.ScreenShotOnFailListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.AssertJUnit.assertTrue;

@Listeners({ScreenShotOnFailListener.class})
public class FindTrainFromMoscowToRyazanTest extends BaseTest {

    @Test
    public void testSearch() {
        SearchTrainPage searchTrainPage = open("http://pass.rzd.ru", SearchTrainPage.class);
        LoginPage loginPage = searchTrainPage.login();
        loginPage.setLoginField("P142H");
        loginPage.setPasswordField("Evangelion0156");
        searchTrainPage = loginPage.clickEnter();

        searchTrainPage.setFromField("Москва");
        searchTrainPage.setToField("Рязань");

        searchTrainPage.setDatefrom("");

        searchTrainPage.returnDateToggleOn();

        searchTrainPage.returnDateToggleOff();
//        searchTrainPage.submit();
    }
}
