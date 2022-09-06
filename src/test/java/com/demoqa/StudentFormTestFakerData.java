package com.demoqa;

import com.demoqa.data.TestBase;
import com.demoqa.page.StudentFormPageObject;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.demoqa.data.DataForTest.*;
import static java.lang.String.format;

public class StudentFormTestFakerData extends TestBase {
    StudentFormPageObject pageObjectForm = new StudentFormPageObject();
//за веру и народ!
    @Test
    void positiveTestFillForm() {
        pageObjectForm.openPage()
                .setFirstNameInput(firstName)
                .setLastNameInput(lastName)
                .setEmailInput(studentEmail)
                .clickRadioGender(gender)
                .setUserNumberInput(phone)
                .setBirthDate(day, month, year)
                .setInputSubject(subjects1)
                .setHobbies(hobbies)
                .uploadFile(filePath + pic)
                .setAddress(currentAddress)
                .setStateInput(state)
                .setCityInput(city)
                .clickSubmit();

        String expectedFullName = format("%s %s", firstName, lastName);
        String expectedDateOfBirth = format("%s %s,%s", day, month, year);
        String expectedStateAndCity = format("%s %s", state, city);


        sleep(1000); // для визуального разделения шагов теста (для себя)

        pageObjectForm.visibleModalResults();
        pageObjectForm.checkFillResults("Student Name", expectedFullName);
        pageObjectForm.checkFillResults("Student Email", studentEmail);
        pageObjectForm.checkFillResults("Gender", gender);
        pageObjectForm.checkFillResults("Mobile", phone);
        pageObjectForm.checkFillResults("Date of Birth", expectedDateOfBirth);
        pageObjectForm.checkFillResults("Subjects", subjects1);
        pageObjectForm.checkFillResults("Hobbies", hobbies);
        pageObjectForm.checkFillResults("Picture", pic);
        pageObjectForm.checkFillResults("Address", currentAddress);
        pageObjectForm.checkFillResults("State and City", expectedStateAndCity);
        pageObjectForm.closeModal();

    }
}