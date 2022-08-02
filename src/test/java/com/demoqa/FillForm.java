package com.demoqa;

import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class FillForm {

    static void elementsForm() {

        $("#firstName").setValue(DateForTest.firstname);
        $("#lastName").setValue(DateForTest.lastname);
        $("#userEmail").setValue(DateForTest.email);
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue(DateForTest.phone);
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
        $("#dateOfBirthInput").sendKeys(DateForTest.dateOfBirth);
        $("#dateOfBirthInput").sendKeys(Keys.ENTER);
        $("#subjectsInput").click();
        $("#subjectsInput").setValue(DateForTest.subjects1).pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/iam.jpg"));
        $("#currentAddress").setValue(DateForTest.currentAddress);
        $("#react-select-3-input").setValue(DateForTest.state).pressEnter();
        $("#react-select-4-input").setValue(DateForTest.city).pressEnter();
        $("#submit").click();

    }


}
