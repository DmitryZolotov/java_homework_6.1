package ru.netology.services;

import org.junit.jupiter.api.Test;

public class CalcServiceTest {

    @Test
    void ThreeMonthHoliday() {
        CalcService service = new CalcService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int rest = service.calculate(income, expenses, threshold);
        System.out.println(rest);

    }

    @Test
    void TwoMonthHoliday() {
        CalcService service = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int rest = service.calculate(income, expenses, threshold);
        System.out.println(rest);
    }
}
