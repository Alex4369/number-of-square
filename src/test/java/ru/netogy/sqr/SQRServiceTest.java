package ru.netogy.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void sumOfSquares() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.sumOfSquares(500, 200);
        Assertions.assertEquals(expected, actual);
    }
}