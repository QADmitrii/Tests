package com.demoqa;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TestEquals {

    static void elementsEquals() {
        $("tbody tr",0).shouldHave(text("Student Name"),text(DataForTest.firstname + " " + DataForTest.lastname));
        $("tbody tr",1).shouldHave(text("Student Email"),text(DataForTest.email));
        $("tbody tr",2).shouldHave(text("Gender"),text(DataForTest.gender));
        $("tbody tr",3).shouldHave(text("Mobile"),text(DataForTest.phone));
        $("tbody tr",4).shouldHave(text("Date of Birth"),text(DataForTest.dateOfBirth));
        $("tbody tr",5).shouldHave(text("Subjects"),text(DataForTest.subjects1));
        $("tbody tr",6).shouldHave(text("Hobbies"),text(DataForTest.hobbies));
        $("tbody tr",7).shouldHave(text("Picture"),text(DataForTest.pic));
        $("tbody tr",8).shouldHave(text("Address"),text(DataForTest.currentAddress));
        $("tbody tr",9).shouldHave(text("State and City"),text(DataForTest.state+ " " + DataForTest.city));
        $("#closeLargeModal").click();

    }

}
