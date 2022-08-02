package com.demoqa;

import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TestEquals {

    static void elementsEquals() {
        $("tbody tr",0).shouldHave(text("Student Name"),text(DateForTest.firstname + " " + DateForTest.lastname));
        $("tbody tr",1).shouldHave(text("Student Email"),text(DateForTest.email));
        $("tbody tr",2).shouldHave(text("Gender"),text(DateForTest.gender));
        $("tbody tr",3).shouldHave(text("Mobile"),text(DateForTest.phone));
        $("tbody tr",4).shouldHave(text("Date of Birth"),text(DateForTest.dateOfBirth));
        $("tbody tr",5).shouldHave(text("Subjects"),text(DateForTest.subjects1));
        $("tbody tr",6).shouldHave(text("Hobbies"),text(DateForTest.hobbies));
        $("tbody tr",7).shouldHave(text("Picture"),text(DateForTest.pic));
        $("tbody tr",8).shouldHave(text("Address"),text(DateForTest.currentAddress));
        $("tbody tr",9).shouldHave(text("State and City"),text(DateForTest.state+ " " + DateForTest.city));
        $("#closeLargeModal").click();

    }

}
