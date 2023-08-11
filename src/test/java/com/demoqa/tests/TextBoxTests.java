package com.demoqa.tests;

import org.junit.jupiter.api.Test;
import com.demoqa.pages.TextBoxPage;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTest() {

        textBoxPage.openPage()
                .seUserName("Mary Watson")
                .setUserEmail("marywatson@gmail.com")
                .setCurrentAddress("40 Lipton Court, Chase Side Sothgate, London, N14")
                .setPermanentAddress("41 Lipton Court, Chase Side Sothgate, London, N15")
                .submit()
                .checkResult(
                "Mary Watson",
                "marywatson@gmail.com",
                "40 Lipton Court, Chase Side Sothgate, London, N14",
                "41 Lipton Court, Chase Side Sothgate, London, N15");
    }
}
