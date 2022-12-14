package com.demoqa.data;

import com.github.javafaker.Faker;

public class DataForTest {

    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            studentEmail = faker.internet().emailAddress(),
            gender = "Male",
            phone = faker.phoneNumber().subscriberNumber(10),
            day = "30",
            month = "November",
            year = "1993",
            subjects1 = "English",
            hobbies = "Sports",
            filePath = "src/test/resources/",
            pic = "iam.jpg",
            currentAddress = faker.address().fullAddress(),
            state = "NCR",
            city = "Noida";



}