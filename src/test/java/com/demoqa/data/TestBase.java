package com.demoqa.data;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.page.StudentFormPageObject;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


    StudentFormPageObject pageObjectForm = new StudentFormPageObject();

    @BeforeAll
    static void config() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
        Configuration.browserSize = "1920x1080";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}