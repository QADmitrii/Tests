package com.demoqa.page.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckResults {

    private final static String TITLE_TEXT = "Thanks for submitting the form";

    public CheckResults checkVisibleModal() {
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text(TITLE_TEXT));

        return this;
    }

    public CheckResults checkForm(String key, String value) {
        $(".table-responsive table").$(byText(key)).parent().shouldHave(text(value));


        return this;
    }
}