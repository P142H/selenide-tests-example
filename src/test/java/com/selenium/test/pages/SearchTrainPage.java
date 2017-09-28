package com.selenium.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SearchTrainPage {

    @FindBy(css = "#DirToggle")
    private WebElement toggleDateTo;

    public LoginPage login() {
        $(By.cssSelector("#headAuth > div.j-profile-links-notlogged > a.orng")).click();
        return page(LoginPage.class);
    }

    public void setFromField(String from) {
        $(By.cssSelector("#name0")).sendKeys(from);
    }

    public void setToField(String to) {
        $(By.cssSelector("#name1")).sendKeys(to);
    }

    public void switchDirection() {
        $(By.cssSelector(".box-form__input-cont-switcher")).click();
    }

    public void setDatefrom(String date1) {
        //TODO set calendar
        $(By.cssSelector("#date0")).sendKeys(date1);
    }

    public void setDateTo(String date2) {
        //TODO set calendar
        $(By.cssSelector("#date1")).sendKeys(date2);
    }

    public TrainListPage submit() {
        $(By.cssSelector("#Submit")).click();
        return page(TrainListPage.class);
    }

    public void returnDateToggleOn() {
        if (!toggleDateTo.isSelected()) {
            System.out.println("Включаем дату 'Обратно'");
            toggleDateTo.click();
        }
    }

    public void returnDateToggleOff() {
        if (toggleDateTo.isSelected()) {
            System.out.println("Выключаем дату 'Обратно'");
            toggleDateTo.click();
        }
    }
}
