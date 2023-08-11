package com.demoqa.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(month);
        //$(".react-datepicker__day--001.react-datepicker__day--weekend").click();
        //$(".react-datepicker__day--030:not(.react-datepicker__" + day + "--outside-month").click();
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }
}
