package com.learning.java.eight.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DatePractice {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        printData(localDate);
        LocalDate localDateWithParse = LocalDate.parse("2022-06-01");
        printData(localDateWithParse);
//        printData(ZoneId.getAvailableZoneIds());
        LocalDate localDateOf = LocalDate.of(2022, Month.AUGUST, 25);
        printData(localDateOf);
        printData(localDateWithParse.getMonthValue());
        printData(localDateWithParse.getDayOfMonth());
    }

    private static void printData(Object localDate) {
        System.out.println(localDate);
    }
}
