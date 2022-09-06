package com.demoqa.data;

import com.codeborne.selenide.Configuration;
import com.demoqa.page.StudentFormPageObject;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    StudentFormPageObject pageObjectForm = new StudentFormPageObject();

    @BeforeAll
    static void config() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
        Configuration.browserSize = "1920x1080";
    }
}