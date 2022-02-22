package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"Range 81-99; 81; 99; 0", "Range 100-120; 100; 120; 1",
            "Range 121-143; 121; 143; 1", "Range 9604-9800; 9604; 9800; 1",
            "Range 9605-9801; 9605; 9801; 1", "Range 9802-10000; 9802; 10000; 0"},
            delimiter = ';')
    void Test_NumberSquaresOfRange(String testName, int startRange, int endRange, int expected) {
        SQRService service = new SQRService();

        int actual = service.numberSquaresOfRange(startRange, endRange);
        assertEquals(expected, actual);

    }

}