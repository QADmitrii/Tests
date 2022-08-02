package com.demoqa;

import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class FillForm {

    static void elementsForm() {

        $("#firstName").setValue(DataForTest.firstname);
        $("#lastName").setValue(DataForTest.lastname);
        $("#userEmail").setValue(DataForTest.email);
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue(DataForTest.phone);
        $("#dateOfBirthInput").click();
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
        $("#dateOfBirthInput").sendKeys(DataForTest.dateOfBirth);
        $("#dateOfBirthInput").sendKeys(Keys.ENTER);
        $("#subjectsInput").click();
        $("#subjectsInput").setValue(DataForTest.subjects1).pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/iam.jpg"));
        $("#currentAddress").setValue(DataForTest.currentAddress);
        $("#react-select-3-input").setValue(DataForTest.state).pressEnter();
        $("#react-select-4-input").setValue(DataForTest.city).pressEnter();
        $("#submit").click();

    }


}
