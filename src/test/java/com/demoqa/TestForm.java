package com.demoqa;

import com.codeborne.selenide.Configuration;
import com.demoqa.Page.PageObjectForm;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class TestForm {
PageObjectForm pageObjectForm = new PageObjectForm();
    @BeforeAll
    static void config() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void positiveTestFillForm() {
        pageObjectForm.openPage()
                .setFirstNameInput("Bob")
                .setLastNameInput("Grey")
                .setEmailInput("valid@mail.com")
                .clickRadioGender()
                .setUserNumberInput("7916557399")
                .setBirthDate("27", "May", "1990")
                .setInputSubject("English")
                .setHobbies()
                .setUploadPic()
                .setAddress("Panipat,1015,2ND")
                .setStateInput("NCR")
                .setCityInput("Noida");

        $("#submit").click();

        sleep(1000); // для визуального разделения шагов теста (для себя)

        pageObjectForm.visibleModalResults();
        pageObjectForm.checkFillResults("Student Name","Bob Grey");
        pageObjectForm.checkFillResults("Student Email","valid@mail.com");
        pageObjectForm.checkFillResults("Gender","Male");
        pageObjectForm.checkFillResults("Mobile","7916557399");
        pageObjectForm.checkFillResults("Date of Birth","27 May,1990");
        pageObjectForm.checkFillResults("Subjects","English");
        pageObjectForm.checkFillResults("Hobbies","Sports");
        pageObjectForm.checkFillResults("Picture","iam.jpg");
        pageObjectForm.checkFillResults("Address","Panipat,1015,2ND");
        pageObjectForm.checkFillResults("State and City","NCR Noida");

        $("#closeLargeModal").click();
    }
}
