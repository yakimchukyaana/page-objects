package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class RegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void registrationFormTest() {

        registrationPage.openPage()
                .setFirstName("Mary")
                .setLastName("Watson")
                .setUserEmail("marywatson@gmail.com")
                .setGender("Female")
                .setNumber("7085600410")
                .setBirthDate("30", "July", "2005")
                .setSubjects("History")
                .setHobbies("Reading")
                .setPicture("shrek.png")
                .setCurrentAddress("40 Lipton Court, Chase Side Sothgate, London, N14")
                .setState("Haryana")
                .setCity("Karnal")
                .submit();

        registrationPage.checkModalAppears()
                .checkTableResult("Student Name", "Mary Watson")
                .checkTableResult("Student Email", "marywatson@gmail.com")
                .checkTableResult("Gender", "Female")
                .checkTableResult("Mobile", "7085600410")
                .checkTableResult("Date of Birth", "30 July,2005")
                .checkTableResult("Subjects", "History")
                .checkTableResult("Hobbies", "Reading")
                .checkTableResult("Picture", "shrek.png")
                .checkTableResult("Address", "40 Lipton Court, Chase Side Sothgate, London, N14")
                .checkTableResult("State and City", "Haryana Karnal");
    }
}
