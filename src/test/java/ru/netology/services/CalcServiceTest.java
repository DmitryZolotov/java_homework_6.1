package ru.netology.services;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000",
//            "100000,60000,150000"
//    })
    @CsvFileSource(files="src/test/resources/calc.csv")
    public void ThreeMonthHoliday(int income, int expenses, int threshold) {
        CalcService service = new CalcService();

//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;

        int rest = service.calculate(income, expenses, threshold);
        System.out.println(rest);

    }

//    @Test
//    void TwoMonthHoliday() {
//        CalcService service = new CalcService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//
//        int rest = service.calculate(income, expenses, threshold);
//        System.out.println(rest);
//    }
}
