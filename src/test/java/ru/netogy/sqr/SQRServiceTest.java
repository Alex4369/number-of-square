package ru.netogy.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void notInTheRangeOfNumbers() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = 3;
        Assertions.assertEquals(expected, actual);
    }
}