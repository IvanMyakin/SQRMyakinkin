package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServicetest {

    @Test
    public void testExpectedActualSQRT() {
        Servicecalcsqrt service = new Servicecalcsqrt();
        int expected = 0;
        int actual = service.calcsqrt(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2ExpectedActualSQRT() {
        Servicecalcsqrt service = new Servicecalcsqrt();
        int expected = 3;
        int actual = service.calcsqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2NotEqualsSQRT() {
        Servicecalcsqrt service = new Servicecalcsqrt();
        int expected = 0;
        int unexpected = 2;
        int actual = service.calcsqrt(10, 99);

        Assertions.assertNotEquals(unexpected, expected);
    }
}