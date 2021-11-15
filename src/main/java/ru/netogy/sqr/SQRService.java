package ru.netogy.sqr;

public class SQRService {

    public int sumOfSquares(int maxLimit,
                            int minLimit) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLimit && i * i <= maxLimit) {
                result = result + 1;
            }

        }
        return result;
    }
}