package com.demoqa.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataProperties {

    private Faker fakerEn;

    public String firstNameValue,
            lastNameValue,
            userEmailValue,
            genderWrapperValue,
            userNumberValue,
            birthDayValue,
            birthMonthValue,
            birthYearValue,
            subjectsInputValue,
            hobbiesWrapperValue,
            uploadPictureValue,
            currentAddressValue,
            stateValue,
            cityValue;

    public TestDataProperties() {
        fakerEn = new Faker(new Locale("en"));
        firstNameValue = TestDataMethods.getRandomFirstName(fakerEn);
        lastNameValue = TestDataMethods.getRandomLastName(fakerEn);
        userEmailValue = TestDataMethods.getRandomUserEmail(fakerEn);
        genderWrapperValue = TestDataMethods.getRandomGender();
        userNumberValue = TestDataMethods.getRandomUserNumber(fakerEn);
        birthDayValue = TestDataMethods.getRandomDay();
        birthMonthValue = TestDataMethods.getRandomMonth();
        birthYearValue = TestDataMethods.getRandomYear();
        subjectsInputValue = TestDataMethods.getRandomSubject();
        hobbiesWrapperValue = TestDataMethods.getRandomHobby();
        uploadPictureValue = TestDataMethods.getRandomPicture();
        currentAddressValue = TestDataMethods.getRandomCurrentAddress(fakerEn);
        stateValue = TestDataMethods.getRandomState();
        cityValue = TestDataMethods.getRandomCity(stateValue);
    }
}
