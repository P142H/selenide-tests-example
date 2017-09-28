package com.selenium.test;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "c:/work/chromedriver.exe");
    }
}
