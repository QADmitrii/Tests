package com.demoqa.Page;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.Page.components.CalendarComponent;
import com.demoqa.Page.components.CheckResults;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PageObjectForm {

    //Elements
    private final static String TITLE_TEXT = "Student Registration Form";
    private CalendarComponent calendarComponent = new CalendarComponent();
    private CheckResults checkResults = new CheckResults();
    private SelenideElement

            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            clickGender = $("[for=gender-radio-1]"),
            userNumberInput = $("#userNumber"),
            inputSubject = $("#subjectsInput"),
            hobbies =$("[for=hobbies-checkbox-1]"),
            uploadPic = $("#uploadPicture"),
            currentAddress =  $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input");

    //Actions
    public PageObjectForm openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public PageObjectForm setFirstNameInput (String value) {
        firstNameInput.setValue(value);

        return this;
    }
    public PageObjectForm setLastNameInput (String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public PageObjectForm setEmailInput (String value) {
        emailInput.setValue(value);

        return this;
    }

    public PageObjectForm clickRadioGender() {
        clickGender.click();

        return this;
    }

    public PageObjectForm setUserNumberInput(String value) {
        userNumberInput.setValue(value);

        return this;
    }
    public PageObjectForm setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public PageObjectForm setInputSubject(String value) {
        inputSubject.setValue(value).pressEnter();

        return this;
    }

    public PageObjectForm setHobbies() {
        hobbies.click();

        return this;
    }

    public PageObjectForm setUploadPic() {
        uploadPic.uploadFile(new File("src/test/resources/iam.jpg"));

        return this;
    }

    public PageObjectForm setAddress (String value) {
        currentAddress.setValue(value);

        return this;
    }
    public PageObjectForm setStateInput (String value) {
        stateInput.setValue(value).pressEnter();

        return this;
    }
    public PageObjectForm setCityInput (String value) {
        cityInput.setValue(value).pressEnter();

        return this;
    }

    public PageObjectForm visibleModalResults(){
        checkResults.checkVisibleModal();

        return this;

    }
    public PageObjectForm checkFillResults(String key, String value){
        checkResults.checkForm(key, value);

        return this;
    }
}
