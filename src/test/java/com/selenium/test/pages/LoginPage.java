package com.selenium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    public void setLoginField(String login) {
        $(By.cssSelector("#j_username")).sendKeys(login);
    }

    public void setPasswordField(String pwd) {
        $(By.cssSelector("#j_password")).sendKeys(pwd);
    }

    public SearchTrainPage clickEnter() {
        $(By.cssSelector(".btn")).click();
        return page(SearchTrainPage.class);
    }
}
