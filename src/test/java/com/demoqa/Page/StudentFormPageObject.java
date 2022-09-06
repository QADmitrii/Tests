package com.demoqa.page;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.page.components.CalendarComponent;
import com.demoqa.page.components.CheckResults;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentFormPageObject {

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
            hobbies = $("[for=hobbies-checkbox-1]"),
            uploadPic = $("#uploadPicture"),
            currentAddress = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input");

    //Actions
    public StudentFormPageObject openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public StudentFormPageObject setFirstNameInput(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public StudentFormPageObject setLastNameInput(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public StudentFormPageObject setEmailInput(String value) {
        emailInput.setValue(value);

        return this;
    }

    public StudentFormPageObject clickRadioGender() {
        clickGender.click();

        return this;
    }

    public StudentFormPageObject setUserNumberInput(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public StudentFormPageObject setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public StudentFormPageObject setInputSubject(String value) {
        inputSubject.setValue(value).pressEnter();

        return this;
    }

    public StudentFormPageObject setHobbies(String value) {

        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }

    public StudentFormPageObject uploadFile(String value) {
        $("#uploadPicture").uploadFile(new File(value));
        return this;

    }

    public StudentFormPageObject setAddress(String value) {
        currentAddress.setValue(value);

        return this;
    }

    public StudentFormPageObject setStateInput(String value) {
        stateInput.setValue(value).pressEnter();

        return this;
    }

    public StudentFormPageObject setCityInput(String value) {
        cityInput.setValue(value).pressEnter();

        return this;
    }

    public StudentFormPageObject clickSubmit() {
        $("#submit").click();

        return this;
    }

    public StudentFormPageObject visibleModalResults() {
        checkResults.checkVisibleModal();

        return this;

    }

    public StudentFormPageObject checkFillResults(String key, String value) {
        checkResults.checkForm(key, value);

        return this;
    }

    public StudentFormPageObject closeModal() {
        $("#closeLargeModal").click();

        return this;

    }
}
